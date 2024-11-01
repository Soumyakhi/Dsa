import java.util.ArrayList;
import java.util.HashSet;

public class FindWords2942Leet {
    public ArrayList<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            for (char chars : words[i].toCharArray()) {
                if(chars==x){
                    al.add(i);
                    break;
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        String []words={"abc","bzd","aaaa","cbc"};
        System.out.println((new FindWords2942Leet()).findWordsContaining(words, 'z'));
    }
}
