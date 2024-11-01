import java.util.HashSet;

public class FirstLetterToAppearTwice2351Leet {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs=new HashSet<>();
        for (Character character : s.toCharArray()) {
            if(hs.contains(character)){
                return character;
            }
            else{
                hs.add(character);
            }
        }
        return '4';
    }
    public static void main(String[] args) {
        System.out.println((new FirstLetterToAppearTwice2351Leet()).repeatedCharacter("null"));
    }
}
