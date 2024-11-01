import java.util.HashMap;
import java.util.Objects;

public class GreatestSumDivThree1262Leet {
    /*static class Key {
        int sum, index;

        Key(int sum, int index) {
            this.sum = sum;
            this.index = index;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Key key = (Key) o;
            return sum == key.sum && index == key.index;
        }
        @Override
        public int hashCode() {
            return Objects.hash(sum, index);
        }
    }

    public int maxSumDivThree(int[] nums) {
        return helper(0, 0, nums, new HashMap<>());
    }

    int helper(int index, int sum, int[] nums, HashMap<Key, Integer> hm) {
        if (index >= nums.length) {
            if (sum % 3 == 0) {
                return sum;
            }
            return Integer.MIN_VALUE;
        }
        Key key = new Key(sum, index);
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        // include
        int inc = helper(index + 1, sum + nums[index], nums, hm);
        // exclude
        int exc = helper(index + 1, sum, nums, hm);
        int res = Math.max(inc, exc);
        hm.put(key, res);
        return res;
    }*/

    /*
     int helper(int index, int mod, int[] nums, HashMap<String, Integer> memo) {
     if (index >= nums.length) {
     if(mod == 0 ) {
     return 0;
     }
     return Integer.MIN_VALUE;
     }
     String key = mod + "," + index;
     if (memo.containsKey(key)) {
     return memo.get(key);
     }
     int include = nums[index] + helper(index + 1, (mod + nums[index]) % 3, nums,
     memo);
     int exclude = helper(index + 1, mod, nums, memo);
     int result = Math.max(include, exclude);
     memo.put(key, result);
     
     return result;
     }
    */

     public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int num : nums) {
            int[] temp = dp.clone();
            for (int sum : temp) {
                dp[(sum + num) % 3] = Math.max(dp[(sum + num) % 3], sum + num);
            }
        }
        return dp[0];
     }
    

    public static void main(String[] args) {
        int[] arr = { 3, 6, 5, 1, 8 };
        System.out.println(
                (new GreatestSumDivThree1262Leet())
                        .maxSumDivThree(arr));
    }
}
