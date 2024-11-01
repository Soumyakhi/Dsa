import java.util.ArrayList;
import java.util.HashMap;

public class PArtitionLabels763Leet {
    public ArrayList<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> lastIndex=new HashMap<>();
        for (int i=0;i<s.length();i++) {
            lastIndex.put(s.charAt(i), i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        int size=0,end=0;
        for (int i=0;i<s.length();i++) {
            size++;
            int lastOccur=lastIndex.get(s.charAt(i));
            end=Math.max(end, lastOccur);
            if(end==i){
                res.add(size);
                size=0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new PArtitionLabels763Leet()).partitionLabels("ababcbacadefegdehijhklij"));
    }
}
