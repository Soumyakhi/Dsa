import java.util.Stack;

public class MyQueue232Leet{
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public MyQueue232Leet() {
        this.s1=new Stack<>();
        this.s2=new Stack<>();
    }
    public void push(int x) {
        while (!s1.isEmpty())
        { 
            s2.push(s1.pop()); 
        } 
        s1.push(x); 
        while (!s2.isEmpty()) 
        { 
            s1.push(s2.pop()); 
        } 
    }
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
