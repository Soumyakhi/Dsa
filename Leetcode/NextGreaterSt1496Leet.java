import java.util.*;
import java.util.stream.Collectors;

public class NextGreaterSt1496Leet {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            int next = st.isEmpty() ? -1 : st.peek();
            nextGreater.put(num, next);
            st.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }
        return result;
    }

}
