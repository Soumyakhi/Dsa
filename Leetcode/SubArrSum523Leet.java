import java.util.*;

public class SubArrSum523Leet {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> modMap=new HashMap<>();
        modMap.put(0, -1);
        int sum=0;
        for (int i=0;i<nums.length;i++) {
            sum=(sum+nums[i])%k;
            if(modMap.containsKey(sum)){
                if(i-modMap.get(sum)>1){
                    return true;
                }
            }
            else{
                modMap.put(sum, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={23,2,4,6,7};
        System.out.println((new SubArrSum523Leet()).checkSubarraySum(arr, 6));
    }
}
