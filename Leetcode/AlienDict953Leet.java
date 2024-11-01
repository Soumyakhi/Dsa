import java.util.HashMap;

public class AlienDict953Leet {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!isInOrder(words[i], words[i + 1], hm)) {
                return false;
            }
        } 
        return true;
    }
    
    private boolean isInOrder(String word1, String word2, HashMap<Character, Integer> hm) {
        int len1 = word1.length(), len2 = word2.length();
    
        for (int i = 0; i < Math.min(len1, len2); i++) {
            int index1 = hm.get(word1.charAt(i));
            int index2 = hm.get(word2.charAt(i));
    
            if (index1 < index2) {
                return true;
            } else if (index1 > index2) {
                return false;
            }
        }
        return len1 <= len2;
    }
    public static void main(String[] args) {
        String []words={"word","world","row"};
        System.out.println((new AlienDict953Leet()).isAlienSorted(words,"worldabcefghijkmnpqstuvxyz"));
    }
}
