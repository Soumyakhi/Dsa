import java.util.*;

public class NextGreaterII503Leet {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            st.push(num);
        }
        int res[]=new int[nums.length];
        int index=nums.length-1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            res[index--]=st.isEmpty()?-1:st.peek();
            st.push(num);
        }
        return res;
    }
}
