import java.util.HashSet;

public class Panagram1832Leet {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>hs=new HashSet<>();
        for (Character ch : sentence.toCharArray()) {
            hs.add(ch);
        }
        if(hs.size()==26){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new Panagram1832Leet()).
        checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
