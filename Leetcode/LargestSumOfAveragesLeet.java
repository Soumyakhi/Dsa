import java.util.ArrayList;
import java.util.HashMap;

public class LargestSumOfAveragesLeet {
    public double largestSumOfAverages(int[] nums, int k) {
        HashMap<String, Double> memo = new HashMap<>();  // Memoization map
        return helper(nums, k, 0, memo);
    }

    double helper(int[] nums, int k, int index, HashMap<String, Double> memo) {
        if(k==1){
            return average(nums, index, nums.length-1);
        }
        String key=index+","+k;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        double maxSum=Double.MIN_VALUE;
        for(int i=index;i<=nums.length-k;i++){
            double currentAvg = average(nums, index, i);
            maxSum = Math.max(maxSum, currentAvg + helper(nums, k - 1, i + 1, memo));
        }
        memo.put(key, maxSum);
        return maxSum;
    }
    double average(int[] nums, int start, int end) {
        double sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum / (end - start + 1);
    }
    public static void main(String[] args) {
        int arr[]={9,1,2,3,9};
        System.out.println((new LargestSumOfAveragesLeet()).largestSumOfAverages(arr, 3));
    }
}
