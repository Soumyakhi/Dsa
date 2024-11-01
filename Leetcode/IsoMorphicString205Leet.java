import java.util.HashMap;
import java.util.HashSet;

public class IsoMorphicString205Leet {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hm1=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        for (int i=0;i<s.length();i++) {
            if(!hm1.containsKey(s.charAt(i))){
                if(hs.contains(t.charAt(i))){
                    return false;
                }
                hm1.put(s.charAt(i), t.charAt(i));
                hs.add(t.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character chr : s.toCharArray()) {
            sb.append(hm1.get(chr));
        }
        return (sb.toString()).equals(t);
    }
    public static void main(String[] args) {
        System.out.println((new IsoMorphicString205Leet()).isIsomorphic("egg", "add"));
    }
}
