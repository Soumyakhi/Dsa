import java.util.Arrays;
public class ContainsDup217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4};
        ContainsDup217 cd=new ContainsDup217();
        System.out.println(cd.containsDuplicate(a));

    }
}
