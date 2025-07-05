import java.util.HashMap;
import java.util.Map;

public class OddSum1524Leet {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int even=1,odd=0;
        int sum = 0;
        long count = 0;
        for (int num : arr) {
            sum += num;
            int mod = sum % 2;
            if(mod==0){
                count=(count+odd)%MOD;
                even++;
            }
            else{
                count=(count+even)%MOD;
                odd++;
            }
        }

        return (int)count; // Add MOD to avoid negative values
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        System.out.println((new OddSum1524Leet()).numOfSubarrays(arr));
    }
}
