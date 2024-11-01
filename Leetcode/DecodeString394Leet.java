import java.util.Stack;

public class DecodeString394Leet {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        for (char chr : s.toCharArray()) {
            if(chr!=']'){
                st.push(chr+"");
            }
            else{
                String str="";
                while (!st.peek().equals("[")) {
                   str=st.pop()+str;
                }
                st.pop();
                String num="";
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    num=st.pop()+num;
                }
                st.push(str.repeat(Integer.parseInt(num)));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new DecodeString394Leet()).decodeString("3[a]2[bc]"));
    }
}
