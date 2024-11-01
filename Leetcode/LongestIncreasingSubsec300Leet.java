public class LongestIncreasingSubsec300Leet {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return memo(0, -1, nums, dp);
    }

    int memo(int curr, int prev, int[] nums, int[][] dp) {
        if (curr == nums.length) {
            return 0;
        }
        if (dp[curr][prev + 1] != -1) {
            return dp[curr][prev + 1];
        }
        int exclude = memo(curr + 1, prev, nums, dp);
        int include = 0;
        if (prev == -1 || nums[curr] > nums[prev]) {
            include = 1 + memo(curr + 1, curr, nums, dp);
        }
        dp[curr][prev + 1] = Math.max(exclude, include);
        return dp[curr][prev + 1];
    }
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};
        System.out.println((new LongestIncreasingSubsec300Leet()).lengthOfLIS(nums));
    }
}
