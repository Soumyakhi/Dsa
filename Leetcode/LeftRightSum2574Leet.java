public class LeftRightSum2574Leet {
    public int[] leftRightDifference(int[] nums) {
        int larr[]=new int[nums.length];
        int rarr[]=new int[nums.length];
        int lsum=0,rsum=0;
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            larr[i]=lsum;
        }
        for(int i=nums.length-2;i>-1;i--){
            rsum+=nums[i+1];
            rarr[i]=rsum;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(rarr[i]-larr[i]);
        }
        return nums;   
    }
    public static void main(String[] args) {
        int []arr={10,4,8,3};
        arr=(new LeftRightSum2574Leet()).leftRightDifference(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
