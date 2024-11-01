import java.util.Arrays;
public class ContainsDup217leet {
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
        ContainsDup217leet cd=new ContainsDup217leet();
        System.out.println(cd.containsDuplicate(a));

    }
}
