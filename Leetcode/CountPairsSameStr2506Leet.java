import java.util.ArrayList;
import java.util.HashSet;

public class CountPairsSameStr2506Leet {
    public int similarPairs(String[] words) {
        ArrayList<HashSet<Character>> al=new ArrayList<>();
        for (String string : words) {
            HashSet<Character> hs=new HashSet<>();
            for (Character chr : string.toCharArray()) {
                hs.add(chr);
            }
            al.add(hs);
        }
        int count=0;
        for(int i=0;i<al.size()-1;i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String words[]={"aba","aabb","abcd","bac","aabc"};
        System.out.println((new CountPairsSameStr2506Leet()).similarPairs(words));
    }
}
