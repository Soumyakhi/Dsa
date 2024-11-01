import java.util.HashMap;
import java.util.HashSet;

public class RotateString796Leet {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if((sb.toString()).equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new RotateString796Leet()).rotateString("abcde", "cdeab"));
    }
}
