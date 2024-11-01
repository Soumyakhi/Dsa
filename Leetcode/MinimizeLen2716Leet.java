import java.util.HashSet;

public class MinimizeLen2716Leet {
    public int minimizedStringLength(String s) {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return hs.size();
    }
    public static void main(String[] args) {
        System.out.println((new MinimizeLen2716Leet()).minimizedStringLength("aaabc"));
    }
}
