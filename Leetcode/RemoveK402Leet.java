import java.util.Stack;

public class RemoveK402Leet {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        Stack<Integer> st=new Stack<>();
        for (Character chr : num.toCharArray()) {
            while (!st.isEmpty() && k>0 && st.peek()>Character.getNumericValue(chr)) {
                st.pop();
                k--;
            }
            st.push(Character.getNumericValue(chr));
        }
        while (!st.isEmpty() && k>0) {
            st.pop();
            k--;
        }
        StringBuilder sBuilder = new StringBuilder();
        for (int digit : st) {
            sBuilder.append(digit);
        }
        
        while (sBuilder.length() > 0 && sBuilder.charAt(0) == '0') {
            sBuilder.deleteCharAt(0);
        }
        
        return sBuilder.length() == 0 ? "0" : sBuilder.toString();
    }
}
