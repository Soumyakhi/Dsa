import java.util.Stack;

public class MinLenAfterRemoval2696Leet {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for (Character character : s.toCharArray()) {
            if(!st.isEmpty()){
                if(character=='D' && st.peek()=='C'){
                        st.pop();
                }
                else if(character=='B' && st.peek()=='A'){
                        st.pop();
                }
                else{
                    st.push(character);
                }
            }
            else{
                st.push(character);
            }
            
        }
        return st.size();
    }
    public static void main(String[] args) {
        System.out.println((new MinLenAfterRemoval2696Leet()).
        minLength("ABFCACDB"));
    }
}
