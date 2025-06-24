import java.util.*;

public class SubArrKDiffInt992Leet {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return Math.abs(calculate(nums, k) - calculate(nums, k-1));
    }
    public int calculate(int []nums,int k){
        if (k<0)
            return 0;
        int left = 0;
        Map<Integer,Integer> intCount=new HashMap<>();
        int countArr = 0;
        for (int right = 0; right < nums.length; right++) {
            intCount.put(nums[right],intCount.getOrDefault(nums[right], 0)+1);
            while (intCount.size() > k && left <= right) {
                intCount.put(nums[left],intCount.getOrDefault(nums[left], 0)-1);
                if(intCount.get(nums[left])<=0){
                    intCount.remove(nums[left]);
                }
                left++;
            }
            countArr += right - left + 1;
        }
        return countArr;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,2,3};
        System.out.println((new SubArrKDiffInt992Leet()).subarraysWithKDistinct(nums, 2));
    }
}
