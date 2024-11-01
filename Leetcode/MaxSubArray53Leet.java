public class MaxSubArray53Leet {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curr=0;
        for (int i=0;i<nums.length;i++) {
            if(curr<0){
                curr=0;
            }
            curr+=nums[i];
            maxSum=Math.max(maxSum, curr);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println((new MaxSubArray53Leet()).maxSubArray(nums));
    }
}
