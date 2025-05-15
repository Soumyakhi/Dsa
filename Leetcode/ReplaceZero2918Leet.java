public class ReplaceZero2918Leet {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int zero1 = 0, zero2 = 0;

        for (int num : nums1) {
            if (num == 0) {
                sum1 += 1;
                zero1++;
            } else {
                sum1 += num;
            }
        }

        for (int num : nums2) {
            if (num == 0) {
                sum2 += 1;
                zero2++;
            } else {
                sum2 += num;
            }
        }
        if (sum1 < sum2 && zero1 == 0)
            return -1;
        if (sum2 < sum1 && zero2 == 0)
            return -1;
        long diff = Math.abs(sum1 - sum2);
        if (diff == 0)
            return sum1;
        int zerosToUse = sum1 < sum2 ? zero1 : zero2;
        long maxGain = (long) zerosToUse * (Integer.MAX_VALUE - 1);
        if (diff > maxGain)
            return -1;
        return Math.max(sum1, sum2);
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 0, 1, 0 };
        int arr2[] = { 6, 5, 0 };
        System.out.println((new ReplaceZero2918Leet()).minSum(arr1, arr2));
    }
}
