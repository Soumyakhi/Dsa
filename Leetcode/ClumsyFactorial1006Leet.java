import java.util.Stack;

public class ClumsyFactorial1006Leet {
    public int clumsy(int n) {
        Stack<Integer> st=new Stack<>();
        st.push(n);
        int count=0;
        n=n-1;
        while(n>=1) {
            if(count%4==0){
                st.push(st.pop()*n);
            }
            else if(count%4==1){
                st.push(st.pop()/n);
            }
            else if(count%4==2){
                st.push(n);
            }
            else if(count%4==3){
                st.push(n*-1);
            }
            count++;
            n--;
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new ClumsyFactorial1006Leet()).clumsy(4));
    }
}
