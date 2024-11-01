import java.util.ArrayList;
import java.util.HashSet;

public class FindDissappeared448Leet {
    public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        /*ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;*/
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index]; 
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i-1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println((new FindDissappeared448Leet()).findDisappearedNumbers(arr));
    }
}
