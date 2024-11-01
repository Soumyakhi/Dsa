import java.util.HashMap;

public class TargetSum414Leet {
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, target, 0, 0,new HashMap<>());
    }
    int ways(int nums[],int target,int index,int sum,HashMap<String,Integer> hm){
        if(target==sum && index==nums.length){
            return 1;
        }
        if(index==nums.length){
            return 0;
        }
        String key=sum+"."+index;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int totalWays=ways(nums, target, index+1,sum+(nums[index]),hm)+ways(nums, target, index+1,sum-(nums[index]),hm);
        hm.put(key, totalWays);
        return totalWays;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,1,1};
        System.out.println((new TargetSum414Leet()).findTargetSumWays(arr, 3));
    }
}
