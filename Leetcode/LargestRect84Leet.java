import java.util.*;

public class LargestRect84Leet {
    public int largestRectangleArea(int[] heights) {
        int psi[] = new int[heights.length];
        int largest = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int idx = st.pop();
                int width = i - psi[idx] - 1;
                largest = Math.max(heights[idx] * width, largest);
            }
            psi[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        if (!st.isEmpty()) {
            int idx = st.pop();
            int width = heights.length - psi[idx] - 1;
            largest = Math.max(heights[idx] * width, largest);
        }
        return largest;
    }
}
