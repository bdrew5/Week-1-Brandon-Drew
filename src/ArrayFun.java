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
        mixedNums[0] = nums[nums.length-1];
        mixedNums[mixedNums.length-1] = nums[0];
        for(int i =1; i < nums.length-1; i++){
            if(nums[i]%nums[i-1] ==0 ){
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
        int max = mixedNums[0];
        int min = mixedNums[0];
        for(int i = 0; i < nums.length; i++){
            if(mixedNums[i] > max) {
                max = mixedNums[i];
            }
            else if(nums[i]> max) {
                max = nums[i];
            }
            if(mixedNums[i] < min) {
                min = mixedNums[i];
            }
            else if(nums[i]< min) {
                min = nums[i];
            }
        }
        return max-min;
    }
}
