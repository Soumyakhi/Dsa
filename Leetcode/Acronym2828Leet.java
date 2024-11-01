import java.util.ArrayList;

public class Acronym2828Leet {
    /*public boolean isAcronym(ArrayList<String> words, String s) {
        StringBuilder sb= new StringBuilder();
        for (String wrd : words) {
            sb.append(wrd.charAt(0));
        }
        return (sb.toString()).equalsIgnoreCase(s);
    }*/
    public boolean isAcronym(ArrayList<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        int index=0;
        for (String wrd : words) {
            if(s.charAt(index)!=wrd.charAt(0)){
                return false;
            }
            index++;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        System.out.println((new Acronym2828Leet()).isAcronym(words, "abc"));
    }
}
