import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKWords692Leet {
    public ArrayList<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i], 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq=new PriorityQueue<>((a, b) -> {
            if((b.getValue() - a.getValue())==0){
                return (b.getKey()).compareTo(a.getKey())*-1;
            }
            else{
                return b.getValue() - a.getValue();
            }    
        });
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            pq.offer(entry);
        }
        var al=new ArrayList<String>();
        while (k!=0) {
            k--;
            al.add(pq.poll().getKey());
        }
        return al;
    }
    public static void main(String[] args) {
        String []words={"i","love","leetcode","i","love","coding"};
        System.out.println((new TopKWords692Leet()).topKFrequent(words, 2));
    }
}
