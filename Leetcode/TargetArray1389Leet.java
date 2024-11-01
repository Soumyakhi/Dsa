import java.util.ArrayList;

public class TargetArray1389Leet {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(index[i], nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=al.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        int res[]=(new TargetArray1389Leet()).createTargetArray(nums, index);
        for (int i : res) {
            System.out.println(i);
        }
        
    }
}
