import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;

public class MakeZero2357Leet {
    /*public int minimumOperations(int[] nums) {
        int steps=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i : nums) {
            if(i>0)
            pq.offer(i);
        }
        while (!pq.isEmpty()) {
            steps++;
            int num=pq.poll();
            Stack<Integer> st=new Stack<>();
            while (!pq.isEmpty()) {
                st.push(pq.poll()-num);
            }
            while (!st.isEmpty()) {
                if(st.peek()!=0){
                    pq.offer(st.pop());
                }
                else{
                    st.pop();
                }
            }
            
        }
        return steps;
    }*/
    public int minimumOperations(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int num : nums){
        if(num > 0){
            set.add(num);
        }
       }
       return set.size();
    }
    public static void main(String[] args) {
        int []arr={1,5,0,3,5};
        System.out.println((new MakeZero2357Leet()).minimumOperations(arr));
    }
}
