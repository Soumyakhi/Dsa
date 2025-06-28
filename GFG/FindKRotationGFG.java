import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKRotationGFG {
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
        List<Integer> arr=new ArrayList<>(Arrays.asList(6, 9, 2, 4));
        System.out.println((new FindKRotationGFG()).findKRotation(arr));
    }
}
