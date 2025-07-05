import java.util.Stack;

public class AsteroidCollision735Leet {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int integer : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && integer < 0) {
                if (Math.abs(st.peek()) < Math.abs(integer)) {
                    st.pop();
                } else if (Math.abs(st.peek()) == Math.abs(integer)) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(integer);
            }
        }
        int index = st.size() - 1;
        int arr[] = new int[st.size()];
        while (!st.isEmpty()) {
            arr[index--] = st.pop();
        }
        return arr;
    }
}
