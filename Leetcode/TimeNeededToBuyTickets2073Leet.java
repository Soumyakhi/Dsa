import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets2073Leet {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<String> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(tickets[i]+","+i);
        }
        int time=0;
        while (!q.isEmpty()) {
            String current=q.poll();
            int number=Integer.parseInt(current.substring(0,current.indexOf(",")));
            int index = Integer.parseInt(current.substring(current.indexOf(",") + 1));
            time++;
            number--;
            if(number==0){
                if(index==k){
                    return time;
                }
            }
            else{
                q.add(number+","+index);
            }
        }
        return time;
    }
    public static void main(String[] args) {
        int []tickets={2,3,2};
        System.out.println((new TimeNeededToBuyTickets2073Leet()).timeRequiredToBuy(tickets, 2));    
    }
}
