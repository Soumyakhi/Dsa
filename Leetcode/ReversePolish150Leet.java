import java.util.*;
public class ReversePolish150Leet {
    public int evalRPN(String[] tokens) {
        Integer first,last;
        Stack<Integer> st=new Stack<>();
        for (String string : tokens) {
            if(string.equals("+")){
                 last=st.pop();
                 first=st.pop();
                st.push(first+last);
            }
            else if(string.equals("-")){
                 last=st.pop();
                 first=st.pop();
                st.push(first-last);
            }
            else if(string.equals("*")){
                 last=st.pop();
                 first=st.pop();
                st.push(first*last);
            }
            else if(string.equals("/")){
                 last=st.pop();
                 first=st.pop();
                st.push(first/last);
            }
            else{
                st.push(Integer.parseInt(string));
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String []s={"2","1","+","3","*"};
        System.out.println((new ReversePolish150Leet()).evalRPN(s));
    }
}
