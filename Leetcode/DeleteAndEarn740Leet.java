import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DeleteAndEarn740Leet {
    /*private Map<String, Integer> memo = new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        return helper(0,hs,nums);
    }
    int helper(int index,HashSet<Integer>hs,int []nums){
        if(index>=nums.length || hs.isEmpty()){
            return 0;
        }
        String key = index + ":" + hs.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        //include
        int include=Integer.MIN_VALUE;
        if(hs.contains(nums[index])){
            boolean plus=hs.remove(nums[index]+1);
            boolean minus=hs.remove(nums[index]-1);
            include=nums[index]+helper(index+1, hs, nums);
            if(plus){
                hs.add(nums[index]+1);
            }
            if(minus){
                hs.add(nums[index]-1);
            }
        }
        //not include
        int exclude=helper(index+1, hs, nums);
        int res=Math.max(include, exclude);
        memo.put(key, res);
        return res;
    }*/
    private Map<Integer, Integer> memo = new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        int[] points = new int[maxNum + 1];
        for (int num : nums) {
            points[num] += num;
        }
        return dp(points, 0);
    }
    private int dp(int[] points, int index) {
        if (index >= points.length) {
            return 0;
        }
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        int include = points[index];
        if (index + 1 < points.length) {
            include += dp(points, index + 2);
        }
        int exclude = dp(points, index + 1);
        int result = Math.max(include, exclude);
        memo.put(index, result);
        return result;
    }
    public static void main(String[] args) {
        int []arr={3,4,2};
        System.out.println((new DeleteAndEarn740Leet()).deleteAndEarn(arr));
    }
}
