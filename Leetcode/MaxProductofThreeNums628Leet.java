import java.util.Arrays;
public class MaxProductofThreeNums628Leet {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=Math.max(nums[n-3]*nums[n-2]*nums[n-1],nums[0]*nums[1]*nums[n-1]);
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println((new MaxProductofThreeNums628Leet()).maximumProduct(nums));
    }
}
