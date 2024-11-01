import java.util.HashMap;
public class FindDifference389Leet {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        char c=' ';
        for (Character character : s.toCharArray()) {
            if(hm.containsKey(character)){
                hm.put(character,hm.get(character)+1);
            }
            else{
                hm.put(character,1);
            }
        }
        for (Character character : t.toCharArray()) {
            if(!hm.containsKey(character) || hm.get(character)<=0){
                c=character;
                break;
            }
            else{
                hm.put(character,hm.get(character)-1);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println((new FindDifference389Leet()).findTheDifference("abcd", "abcde"));
    }
}
