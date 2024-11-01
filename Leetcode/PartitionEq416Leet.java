import java.util.HashMap;

public class PartitionEq416Leet {
    public boolean canPartition(int[] nums) {
        int total=0;
        for (int i=0;i<nums.length;i++) {
            total+=nums[i];
        }
        if(total%2==1){
            return false;
        }
        return parts(0, total/2, 0, nums,new HashMap<>());
    }
    boolean parts(int sum1,int target,int index,int []nums,HashMap<String,Boolean> hm){
        if(sum1==target){
            return true;
        }
        if(index>=nums.length || sum1>target){
            return false;
        }
        String key = index+ ","+sum1;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        boolean result=parts(sum1+nums[index], target, index+1, nums,hm)||parts(sum1, target, index+1, nums,hm);
        hm.put(key, result);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,5,11,5};
        System.out.println((new PartitionEq416Leet()).canPartition(arr));
    }
}
