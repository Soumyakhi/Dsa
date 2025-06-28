import java.util.List;

public class CheckIfRotated1752Leet {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }

    public int findKRotation(List<Integer> arr) {

        // Code here
        int low = 0, high = arr.size() - 1, ans = Integer.MAX_VALUE, index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < ans) {
                    ans = arr.get(low);
                    index = low;
                }
                break;
            }
            if (arr.get(mid) >= arr.get(low)) {
                if (ans > arr.get(low)) {
                    index = low;
                    ans = arr.get(low);
                }
                low = mid + 1;
            } else {
                if (ans > arr.get(mid)) {
                    index = mid;
                    ans = arr.get(mid);
                    high = mid - 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        System.out.println((new CheckIfRotated1752Leet()).check(arr));
    }
}
