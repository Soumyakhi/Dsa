import java.util.ArrayList;

public class FindDup442Leet {
    public ArrayList<Integer> findDuplicates(int[] nums) {
        var al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                al.add(Math.abs(nums[i]));
            }
            else{
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*-1;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println((new FindDup442Leet()).findDuplicates(arr));
    }
}
