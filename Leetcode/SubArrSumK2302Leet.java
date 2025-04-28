import java.util.HashMap;
import java.util.Map;

public class SubArrSumK2302Leet {
    public long countSubarrays(int[] nums, long k) {
        int l = 0;
        long sum = 0, count = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum * (r - l + 1) >= k) {
                sum -= nums[l];
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[]={2,1,4,3,5};
        System.out.println((new SubArrSumK2302Leet()).countSubarrays(arr, 10));
    }
    
}
