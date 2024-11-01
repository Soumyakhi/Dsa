import java.util.HashSet;
import java.util.Stack;

public class SortArrayParity922Leet {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> odd=new Stack<>();
        Stack<Integer> even=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.push(nums[i]);
            }
            else{
                odd.push(nums[i]);
            }
        }
        int indexEven=0,indexOdd=1;
        while (!odd.isEmpty() && !even.isEmpty()) {
            nums[indexEven]=even.pop();
            nums[indexOdd]=odd.pop();
            indexEven+=2;
            indexOdd+=2;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[]arr={4,2,5,7};
        arr=(new SortArrayParity922Leet()).sortArrayByParityII(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
