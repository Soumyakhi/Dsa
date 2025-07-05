import java.util.Stack;

public class SumSubArrRanges2104Leet {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] nextSmaller = new int[n];
        int[] nextGreater = new int[n];
        int[] prevSmaller = new int[n];
        int[] prevGreater = new int[n];

        Stack<Integer> st = new Stack<>();
        Stack<Integer> stMax = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i])
                st.pop();
            nextSmaller[i] = st.isEmpty() ? n : st.peek();
            st.push(i);

            while (!stMax.isEmpty() && nums[stMax.peek()] < nums[i])
                stMax.pop();
            nextGreater[i] = stMax.isEmpty() ? n : stMax.peek();
            stMax.push(i);
        }

        st.clear();
        stMax.clear();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i])
                st.pop();
            prevSmaller[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);

            while (!stMax.isEmpty() && nums[stMax.peek()] <= nums[i])
                stMax.pop();
            prevGreater[i] = stMax.isEmpty() ? -1 : stMax.peek();
            stMax.push(i);
        }

        long minSum = 0, maxSum = 0;
        for (int i = 0; i < n; i++) {
            long leftMin = i - prevSmaller[i];
            long rightMin = nextSmaller[i] - i;
            long leftMax = i - prevGreater[i];
            long rightMax = nextGreater[i] - i;

            minSum += (long) nums[i] * leftMin * rightMin;
            maxSum += (long) nums[i] * leftMax * rightMax;
        }

        return maxSum - minSum;
    }

}
