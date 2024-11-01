import java.util.HashSet;

public class ConsistentStr1684Leet {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs=new HashSet<>();
        for (Character character : allowed.toCharArray()) {
            hs.add(character);
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isConsistent(words[i], hs)){
                count++;
            }
        }
        return count;
    }
    boolean isConsistent(String s,HashSet<Character> hs){
        for (Character ch : s.toCharArray()) {
            if(!hs.contains(ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"a","b","c","ab","ac","bc","abc"};
        System.out.println((new ConsistentStr1684Leet()).countConsistentStrings("abc", words));
    }
}
