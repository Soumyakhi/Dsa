import java.util.HashSet;

public class GreatestLetter2309Leet {
    public String greatestLetter(String s) {
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        for (Character character : s.toCharArray()) {
            if(Character.isUpperCase(character)){
                upper.add(character);
            }
            else{
                lower.add(character);
            }
        }
        int max=Integer.MIN_VALUE;
        for (Character character : upper) {
            if(lower.contains(Character.toLowerCase(character))){
                max=Math.max(max, (int)character);
            }
        }
        if(max==Integer.MIN_VALUE){
            return "";
        }
        return Character.toString((char) max);
    }
    public static void main(String[] args) {
        System.out.println((new GreatestLetter2309Leet()).greatestLetter("arRAzFif"));
    }
}
