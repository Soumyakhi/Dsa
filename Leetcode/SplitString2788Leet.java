import java.util.ArrayList;
import java.util.Arrays;

public class SplitString2788Leet {
    public ArrayList<String> splitWordsBySeparator(ArrayList<String> words, char separator) {
        StringBuilder sb=new StringBuilder();
        ArrayList<String> ls=new ArrayList<>(); 
        for (String string : words) {
            string=string.replace(separator,' ');
            String []sr=string.split(Character.toString(separator));
            for (String string2 : sr) {
                System.out.println(string2);
                if(!string2.equals("")){
                    ls.add(string2);
                }
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        String []st={"easy","problem","$easy$","$problem$"};
        ArrayList<String> words=(ArrayList<String>) Arrays.asList(st);
        System.out.println((new SplitString2788Leet()).splitWordsBySeparator(words, '$'));
    }
}
