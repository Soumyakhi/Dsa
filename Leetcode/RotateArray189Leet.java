import java.util.LinkedList;
import java.util.Queue;

public class RotateArray189Leet {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        Queue<Integer> qu1=new LinkedList<>();
        Queue<Integer> qu2=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-k){
                qu1.add(nums[i]);
            }
            else{
                qu2.add(nums[i]);
            }
        }
        int index=0;
        while (!qu2.isEmpty()) {
            nums[index++]=qu2.poll();
        }
        while (!qu1.isEmpty()) {
            nums[index++]=qu1.poll();
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        (new RotateArray189Leet()).rotate(arr, 3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
