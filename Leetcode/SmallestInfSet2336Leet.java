import java.util.HashSet;
import java.util.PriorityQueue;

public class SmallestInfSet2336Leet {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    HashSet<Integer> set=new HashSet<>();
    public SmallestInfSet2336Leet() {
        for(int i=1;i<=1000;i++){
            pq.add(i);
            set.add(i);
        }
    }
    public int popSmallest() {
        int num=pq.poll();
        set.remove(num);
        return num;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){
            set.add(num);
            pq.offer(num);
        }
    }
}
