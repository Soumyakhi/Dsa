import java.util.*;
import java.util.Stack;
class Pair{
    int price;
    int count;
    Pair(int price,int count){
        this.price=price;
        this.count=count;
    }
}
public class SrockSpanner901Leet {
    Stack<Pair> st=new Stack<>();
    public SrockSpanner901Leet() {
        st=new Stack<>();
    }
    public int next(int price) {
        if(st.isEmpty() || st.peek().price>price){
            st.push(new Pair(price,1));
            return 1;
        }
        int count=1;
        while (!st.isEmpty() && st.peek().price<=price) {
            count+=st.pop().count;
        }
        st.push(new Pair(price,count));
        return count;
    }
}
