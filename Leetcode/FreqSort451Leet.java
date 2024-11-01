import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreqSort451Leet {
    public String frequencySort(String s) {
        ArrayList<Character> al=new ArrayList<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        for (Character ch : s.toCharArray()) {
            al.add(ch);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        al.sort((a, b) -> {
            int val= hm.get(a).compareTo(hm.get(b))*-1;
            if(val==0){
                return Integer.valueOf((int)a).compareTo(Integer.valueOf((int)b))*-1;
            }
            return val;
        });
        StringBuilder sb=new StringBuilder();
        for (Character character : al) {
            sb.append(character);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new FreqSort451Leet()).frequencySort("eeeelolovtcd"));
    }
}
