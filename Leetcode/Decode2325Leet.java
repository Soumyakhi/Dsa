import java.util.HashMap;

public class Decode2325Leet {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        int index=0;
        for (Character ch : key.toCharArray()) {
            if(!hm.containsKey(ch) && Character.isAlphabetic(ch)){
                int chr=97+index;
                hm.put(ch, (char)chr);
                index++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character msg : message.toCharArray()) {
            if(hm.containsKey(msg)){
                sb.append(hm.get(msg));
            }
            else{
                sb.append(msg);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new Decode2325Leet()).decodeMessage("the quick brown fox jumps over the lazy dog"
        , "vkbs bs t suepuv"));
    }
}
