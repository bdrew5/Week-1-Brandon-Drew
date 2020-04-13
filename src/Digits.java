import java.util.ArrayList;

public class Digits {

    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear
     * in the original number.
     */
    private ArrayList digitList;

    /**
     * Constructs a Digits object that represents num.
     * Precondition: num >= 0
     */
    public Digits(int num) {
        for (int i = 10; i < num; i = i * 10) {
            digitList.add(0, num % i);
        }
    }

    /**
     * Returns true if the digits in this Digits object are in
     * strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < digitList.size(); i++) {
            num1 = (int) digitList.get(i - 1);
            num2 = (int) digitList.get(i);
            if (num1 > num2) {
                return false;
            }
        }
        return true;
    }
}
