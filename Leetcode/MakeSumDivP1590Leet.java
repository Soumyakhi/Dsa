import java.util.HashMap;
import java.util.Map;

public class MakeSumDivP1590Leet {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int remainder = (int) (totalSum % p);
        if (remainder == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        long prefixSum = 0;
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            int target = (int) ((prefixSum - remainder + p) % p);
            if (map.containsKey(target)) {
                res = Math.min(res, i - map.get(target));
            }
            map.put((int) prefixSum, i);
        }

        return res == nums.length ? -1 : res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 2 };
        System.out.println((new MakeSumDivP1590Leet()).minSubarray(arr, 6));

    }
}
