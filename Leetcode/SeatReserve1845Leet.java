import java.util.PriorityQueue;

public class SeatReserve1845Leet {
    PriorityQueue<Integer> pq;
    public SeatReserve1845Leet(int n) {
        this.pq=new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            pq.add(i);
        }
    }
    public int reserve() {
        return pq.poll();
    }
    
    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}
