import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPath71Leet {
    public String simplifyPath(String path) {
        String []st=path.split("/");
        ArrayList<String> al=new ArrayList<>();
        for (String string : st) {
            if(!string.equals("")){
                al.add(string);
            }
        }
        Stack<String> s=new Stack<>();
        for (String string : al) {
            if(!string.equals("..") && !string.equals(".")){
                s.push(string);
            }
            else if(string.equals("..") && !s.isEmpty()){
                s.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append('/');
        for (String string : s) {
            sb.append(string+"/");
        }
        if((sb.toString()).length()<2){
            return sb.toString();
        }
        return (sb.toString()).substring(0,(sb.toString()).length()-1);
    }
    public static void main(String[] args) {
        String s="/home/user/Documents/../Pictures";
        SimplifyPath71Leet sm=new SimplifyPath71Leet();
        System.out.println(sm.simplifyPath(s));
    }
}
