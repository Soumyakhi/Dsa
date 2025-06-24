import java.util.ArrayList;
import java.util.List;

public class MaxOneIII1004Leet {
    /*
     * public int longestOnes(int[] nums, int k) {
     * int zeroCount=0,start=0;
     * List<Integer> lst=new ArrayList<>();
     * int max=0;
     * for(int i=0;i<nums.length;i++){
     * if(nums[i]==0){
     * 
     * lst.add(i);
     * 
     * zeroCount++;
     * if(zeroCount>k){
     * start=lst.remove(0)+1;
     * }
     * }
     * max=Math.max(max, i-start+1);
     * }
     * return max;
     * }
     */
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int countZeroes = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                countZeroes++;
            }
            if (countZeroes > k) {
                if (nums[left] == 0) {
                    countZeroes--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println((new MaxOneIII1004Leet()).longestOnes(arr, 2));
    }
}
