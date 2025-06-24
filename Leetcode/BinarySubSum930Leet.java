public class BinarySubSum930Leet {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > goal && left <= right) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        left = 0;
        sum = 0;
        int countMinus = 0;
        if (goal > 0) {
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum > goal - 1 && left <= right) {
                    sum -= nums[left];
                    left++;
                }
                countMinus += right - left + 1;
            }
        }
        return Math.abs(count - countMinus);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 1 };
        System.out.println((new BinarySubSum930Leet()).numSubarraysWithSum(arr, 2));
    }
}
