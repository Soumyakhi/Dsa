import java.util.*;

public class SubOfSubArr907Leet {
    public int sumSubarrayMins(int[] arr) {
        final int MOD = 1_000_000_007;
        int []nextSmaller=new int[arr.length];
        int []prevSmaller=new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            while (!st.isEmpty() && arr[st.peek()] > num) {
                st.pop();
            }
            int next = st.isEmpty() ? arr.length : st.peek();
            nextSmaller[i]=next;
            st.push(i);
        }
        st.clear();;
        for (int i = 0; i <= arr.length-1; i++) {
            int num = arr[i];
            while (!st.isEmpty() && arr[st.peek()] >= num) {
                st.pop();
            }
            int prev = st.isEmpty() ? -1 : st.peek();
            prevSmaller[i]=prev;
            st.push(i);
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            long left = i - prevSmaller[i];
            long right = nextSmaller[i] - i;
            sum = (sum + arr[i] * left % MOD * right % MOD) % MOD;
        }
        return (int) sum;
    }
}
