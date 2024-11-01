import java.util.ArrayList;

public class Segment434Leet {
    public int countSegments(String s) {
        String[] st=s.split(" ");
        ArrayList<String> str=new ArrayList<>();
        for (String string : st) {
            if(!string.equals("")){
                str.add(string);
            }
        }
        return str.size();
    }
    public static void main(String[] args) {
        Segment434Leet sg=new Segment434Leet();
        System.out.println(sg.countSegments(""));
    }
}
