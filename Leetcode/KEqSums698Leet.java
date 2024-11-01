import java.util.Arrays;
import java.util.HashMap;

public class KEqSums698Leet {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        Arrays.sort(nums);
        reverse(nums);
        if (sum % k != 0) {
            return false;
        }
        int targetSum = sum / k;
        int[] res = new int[k];
        return isPossible(0, res, nums, targetSum,new HashMap<>());
    }
    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    boolean isPossible(int index,int[] res,int[] nums,int targetSum,HashMap<String,Boolean> hm){
        if(index==nums.length){
            for(int i=1;i<res.length;i++){
                if(res[i]!=targetSum){
                    return false;
                }
            }
            return true;
        }
        String key = Arrays.toString(res);
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        for(int i=0;i<res.length;i++){
            if (res[i] + nums[index] > targetSum) {
                continue;
            }
            res[i]=res[i]+nums[index];
            if(isPossible(index+1, res, nums,targetSum,hm)){
                return true;
            }
            res[i]=res[i]-nums[index];
            if (res[i] == 0) {
                break;
            }
        }
        hm.put(key,false);
        return false;
    }
    public static void main(String[] args) {
        int []nums={4,3,2,3,5,2,1};
        System.out.println((new KEqSums698Leet()).canPartitionKSubsets(nums, 4));
    }
}
