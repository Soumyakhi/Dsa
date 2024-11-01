import java.util.HashMap;
import java.util.HashSet;

public class MorseCodeWords804Leet {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> hm=new HashMap<>();
        int index=0;
        String dict[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(char i='a';i<='z';i++){
            hm.put(i, dict[index++]);
        }
        HashSet<String> hs=new HashSet<>();
        for (String string : words) {
            StringBuilder sb=new StringBuilder();
            for (char ch : string.toCharArray()) {
                sb.append(hm.get(ch));
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
    public static void main(String[] args) {
        String []words={"gin","zen","gig","msg"};
        System.out.println((new MorseCodeWords804Leet()).uniqueMorseRepresentations(words));
    }
}
