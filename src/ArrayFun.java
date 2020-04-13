public class ArrayFun {
    private int[] nums;
    private int[] mixedNums;

    public ArrayFun(int[] arr){
        nums = arr;
        mixedNums = new int[nums.length];
        mixUp();
    }

    public int[] getNums(){
        return nums;
    }

    public int[] getMixedNums(){
        return mixedNums;
    }

    public void mixUp(){
        mixedNums[0] = nums[0];
        mixedNums[mixedNums.length-1] = nums[nums.length-1];
        for(int i =1; i < nums.length-1; i++){
            if(nums[i]%nums[i-1] ==0){
                mixedNums[i] = (nums[i]/nums[i-1]) * nums[i+1];
            }
            else if(nums[i] > nums[i+1]){
                mixedNums[i] = nums[i] / nums[i+1];
            }
            else{
                mixedNums[i] = nums[i];
            }
        }
    }

    public int greatestDiff(){
        int maxNums = 0;
        int maxMixed = 0;
        for(int i = 0; i < nums.length; i++){
            maxMixed += mixedNums[i];
            maxNums += nums[i];
        }
        return Math.abs(maxNums - maxMixed);
    }
}
