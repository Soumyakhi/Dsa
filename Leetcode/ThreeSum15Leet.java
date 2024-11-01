import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum15Leet {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int first = i + 1;
            int last = nums.length - 1;
            while (first < last) {
                int sum = nums[i] + nums[first] + nums[last];

                if (sum == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[first]);
                    triplet.add(nums[last]);
                    all.add(triplet);
                    first++;
                    while (first < last && nums[first] == nums[first - 1]) {
                        first++;
                    }
                    last--;
                    while (first < last && nums[last] == nums[last + 1]) {
                        last--;
                    }
                } else if (sum < 0) {
                    first++;
                } else {
                    last--;
                }
            }
        }

        return all;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println((new ThreeSum15Leet()).threeSum(arr));
    }
}
