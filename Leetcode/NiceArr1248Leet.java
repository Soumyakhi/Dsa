public class NiceArr1248Leet {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return Math.abs(calculate(nums, k) - calculate(nums, k-1));
    }
    public int calculate(int []nums,int k){
        if (k<0)
            return 0;
        int left = 0;
        int count = 0;
        int countArr = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                count++;
            }
            while (count > k && left <= right) {
                if (nums[left] % 2 != 0) {
                    count--;
                }
                left++;
            }
            countArr += right - left + 1;
        }
        return countArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 1 };
        System.out.println((new NiceArr1248Leet()).numberOfSubarrays(arr, 3));
    }
}
