public class MinSizeSubArraySum209Leet {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize=Integer.MAX_VALUE;
        int targetSum=0;
        int l=0,r=0;
        for (r = 0; r < nums.length; r++) {
            targetSum += nums[r];
            
            while (targetSum >= target) {
                minSize = Math.min(minSize, r - l + 1);
                targetSum -= nums[l++];
            }
        }
        if(minSize==Integer.MAX_VALUE){
            return 0;
        }
        return minSize;
    }
    public static void main(String[] args) {
        int []arr={2,3,1,2,4,3};
        System.out.println((new MinSizeSubArraySum209Leet()).minSubArrayLen(7, arr));
    }
}
