import java.util.HashSet;

public class SubArraysEqualSum2395Leet {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int sum=nums[i]+nums[i+1];
            if(hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int []n={1,2,3,4,5};
        System.out.println((new SubArraysEqualSum2395Leet()).findSubarrays(n));
    }
}
