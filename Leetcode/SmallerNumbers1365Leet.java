import java.util.ArrayList;
import java.util.Collections;

public class SmallerNumbers1365Leet {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
        Collections.sort(al);
        for(int i=0;i<nums.length;i++){
            nums[i]=al.indexOf(nums[i]);
        }
        return nums;   
    }
    public static void main(String[] args) {
        int []arr={8,1,2,2,3};
        arr=((new SmallerNumbers1365Leet()).smallerNumbersThanCurrent(arr));
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print(']');
    }
}
