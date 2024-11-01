import java.util.ArrayList;

public class LastWord58Leet {
    public int lengthOfLastWord(String s) {
        String []str=s.split(" ");
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals("")==false){
                al.add(str[i]);
            }
        }
        int size=al.get(al.size()-1).length();
        return size;
    }
    public static void main(String[] args) {
        LastWord58Leet lw=new LastWord58Leet();
        System.out.println(lw.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
