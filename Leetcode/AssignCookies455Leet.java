import java.util.Arrays;

public class AssignCookies455Leet {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie=0;
        for (int i : g) {
            if(cookie==s.length){
                return count;
            }
            while(cookie<s.length && i>s[cookie]){
                cookie++;
            }
            if(cookie<s.length){
                count++;
            }
            cookie++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[]g={1,2,3};
        int[]s={1,1};
        System.out.println((new AssignCookies455Leet()).findContentChildren(g, s));
    } 
}
