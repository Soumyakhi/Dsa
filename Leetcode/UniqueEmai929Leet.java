import java.util.HashMap;
import java.util.HashSet;

public class UniqueEmai929Leet {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String s1=emails[i].substring(0, emails[i].indexOf("@"));
            String s2=emails[i].substring(emails[i].indexOf("@")+1);
            s1=s1.replace(".", "");
            if(s1.indexOf("+")!=-1){
                s1=s1.substring(0, s1.indexOf("+"));
            }
            s1=s1+" "+s2;
            hs.add(s1);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        String arr[]={"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println((new UniqueEmai929Leet()).numUniqueEmails(arr));
    }
}
