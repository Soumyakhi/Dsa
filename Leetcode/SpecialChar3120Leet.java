import java.util.HashSet;

public class SpecialChar3120Leet {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>hs1=new HashSet<>();
        HashSet<Character>hs2=new HashSet<>();
        for (char chr : word.toCharArray()) {
            if(Character.toUpperCase(chr)==chr){
                hs1.add(Character.toLowerCase(chr));
            }
            if(Character.toLowerCase(chr)==chr){
                hs2.add(chr);
            }
        }
        int count=0;
        for (Character character : hs1) {
            if(hs2.contains(character)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new SpecialChar3120Leet()).numberOfSpecialChars("aaAbcBC"));
    }
}
