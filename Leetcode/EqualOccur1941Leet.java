import java.util.HashMap;
import java.util.HashSet;

public class EqualOccur1941Leet {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        hm.forEach((k,v)->{
            hs.add(v);
        });
        return hs.size()==1;
    }
    public static void main(String[] args) {
        System.out.println((new EqualOccur1941Leet()).areOccurrencesEqual("abacbc"));
    }
}
