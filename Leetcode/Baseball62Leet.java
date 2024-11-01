import java.util.Stack;

public class Baseball62Leet {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int b=st.pop();
                int a=st.pop();
                int c=b+a;
                st.push(a);
                st.push(b);
                st.push(c);
            }
            else if(operations[i].equals("D")){
                int a=st.pop();
                int b=2*a;
                st.push(a);
                st.push(b);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while (!st.isEmpty()) {
            sum+=st.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        String []str={"5","2","C","D","+"};
        System.out.println((new Baseball62Leet()).calPoints(str));
    }
}
