import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack155Leet {
    Stack<Integer> st;
    PriorityQueue<Integer> pq;
    public MinStack155Leet() {
        st=new Stack<>();
        pq=new PriorityQueue<>();
    }
    
    public void push(int val) {
        st.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int x=st.pop();
        Stack<Integer> st1=new Stack<>();
        while (!pq.isEmpty() && x!=pq.peek()) {
            st1.push(pq.poll());
        }
        if(!pq.isEmpty()){
            pq.poll();
        }
        while (!st1.isEmpty()) {
            pq.offer(st1.pop());
        }
    }
    public int top() {
        return this.st.peek();
    }
    public int getMin() {
        return pq.peek();   
    }
    public static void main(String[] args) {
        MinStack155Leet st=new MinStack155Leet();
        st.push(0);
        st.push(1);
        st.push(0);
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
    }
}
