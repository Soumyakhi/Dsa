import java.util.HashSet;

public class JewLesStones771Leet {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> ch=new HashSet<>();
        for (char jew : jewels.toCharArray()) {
            ch.add(jew);
        }
        int count=0;
        for (Character character : stones.toCharArray()) {
            if(ch.contains(character)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new JewLesStones771Leet()).numJewelsInStones("aA", "aAAbbbb"));
    }
}
