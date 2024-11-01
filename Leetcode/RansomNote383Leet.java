import java.util.HashMap;

public class RansomNote383Leet {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (char chr : ransomNote.toCharArray()) {
            hm1.put(chr, hm1.getOrDefault(chr, 0)+1);
        }
        for (char chr : magazine.toCharArray()) {
            hm2.put(chr, hm2.getOrDefault(chr, 0)+1);
        }
        boolean arr[]={true};
        hm1.forEach((k,v)->{
            if(!hm2.containsKey(k) || v>hm2.get(k)){
                arr[0]=false;
                return;
            }
        });
        return arr[0];
    }
    public static void main(String[] args) {
        System.out.println((new RansomNote383Leet()).canConstruct("aa", "aab"));
    }
}
