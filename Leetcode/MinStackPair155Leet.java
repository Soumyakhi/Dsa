import java.util.PriorityQueue;
import java.util.Stack;

class Pair{
    int val;
    int min;
    Pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
public class MinStackPair155Leet {
    Stack<Pair> st=new Stack<>();
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
        }
        else{
            st.push(new Pair(val, Math.min(val,st.peek().min)));
        }
    }
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    public int top() {
        return this.st.peek().val;
    }
    public int getMin() {
        return st.peek().min;   
    }
}
