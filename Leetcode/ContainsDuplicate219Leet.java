import java.util.HashSet;

public class ContainsDuplicate219Leet {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(i-l>k){
                hs.remove(nums[l]);
                l++;
            }
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println((new ContainsDuplicate219Leet()).containsNearbyDuplicate(nums,3));
    }
}
