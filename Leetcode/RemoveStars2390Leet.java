import java.util.Stack;

public class RemoveStars2390Leet {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for (Character character : s.toCharArray()) {
            if(character=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(character);
            }
        }
        if(st.isEmpty()){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : st) {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new RemoveStars2390Leet()).removeStars("leet**cod*e"));
    }
}

