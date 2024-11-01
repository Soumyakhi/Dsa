import java.util.HashMap;

public class ComboSumIV377Leet {
    public int combinationSum4(int[] nums, int target) {
        return helper(nums, target,new HashMap<>());
    }
    int helper(int []nums,int target,HashMap<Integer,Integer> hm){
        if(target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        if(hm.containsKey(target)){
            return hm.get(target);
        }
        int totalWays=0;
        for(int i=0;i<nums.length;i++){
            totalWays+=helper(nums, target-nums[i],hm);
        }
        hm.put(target,totalWays);
        return totalWays;
    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println((new ComboSumIV377Leet()).combinationSum4(nums, 4));
    }
}
