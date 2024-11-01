import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortOddEvenIndependendently2164Leet {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            even.add(nums[i]);
        }
        for(int i=1;i<nums.length;i+=2){
            odd.add(nums[i]);
        }
        Collections.sort(even);
        odd.sort((a,b)->b-a);
        int index=0;
        for (Integer integer : even) {
            nums[index]=integer;
            index+=2;
        }
        index=1;
        for (Integer integer : odd) {
            nums[index]=integer;
            index+=2;
        }
        return nums;
    }
    public static void main(String[] args) {
        int []nums={4,1,2,3};
        System.out.println(Arrays.toString((new SortOddEvenIndependendently2164Leet()).sortEvenOdd(nums)));
    }
}
