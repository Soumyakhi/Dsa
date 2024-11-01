import java.util.Arrays;

public class KeepMultiplyingBuyTwo2154Leet {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i : nums) {
            if(i==original){
                original*=2;
            }
            if(i>original){
                return original;
            }
        }
        return original;
    }
    public static void main(String[] args) {
        int nums[]={5,3,6,1,12};
        System.out.println((new KeepMultiplyingBuyTwo2154Leet()).
        findFinalValue(nums, 3));
    }
}
