import java.util.Stack;

public class DailyTemp739Leet {
    public int[] dailyTemperatures(int[] temperatures) {
        int []res=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=temperatures.length-1;i>-1;i--){
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int []temperatures={73,74,75,71,69,72,76,73};
        int []res=(new DailyTemp739Leet()).dailyTemperatures(temperatures);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
