import java.util.HashMap;

public class HouseRobber198Leet {
    public int rob(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        return Math.max(memorize1(0, nums,0,new HashMap<>()),memorize2(1, nums,0,new HashMap<>()));
    }
    int memorize1(int index,int []nums,int max,HashMap<Integer,Integer> hm){
        if(index>=nums.length-1){
            return max;
        }
        if(hm.containsKey(index)){
            return hm.get(index)+max;
        }
        int sum1=memorize1(index+1,nums,max,hm);
        int sum2=memorize1(index+2,nums,max+nums[index],hm);
        int res=(Math.max(sum1, sum2));
        hm.put(index, res-max);
        return res;
    }
    int memorize2(int index,int []nums,int max,HashMap<Integer,Integer> hm){
        if(index>=nums.length){
            return max;
        }
        if(hm.containsKey(index)){
            return hm.get(index)+max;
        }
        int sum1=memorize2(index+1,nums,max,hm);
        int sum2=memorize2(index+2,nums,max+nums[index],hm);
        int res=(Math.max(sum1, sum2));
        hm.put(index, res-max);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2};
        System.out.println((new HouseRobber198Leet()).rob(arr));
    }
}
