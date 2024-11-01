import java.util.Stack;

public class GreatString1544Leet {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for (Character character : s.toCharArray()) {
            if(!st.isEmpty() && ((Character.isUpperCase(character) && Character.toLowerCase(character)==st.peek())
            ||Character.isLowerCase(character) && Character.toUpperCase(character)==st.peek())){
                st.pop();
            }
            else{
                st.push(character);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : st) {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new GreatString1544Leet()).makeGood("abBAcC"));
    }
}
