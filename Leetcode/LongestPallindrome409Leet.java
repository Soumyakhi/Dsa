import java.util.HashMap;

public class LongestPallindrome409Leet {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char chr : s.toCharArray()) {
            hm.put(chr,hm.getOrDefault(chr, 0)+1);
        }
        boolean takenSingle[]={false};
        int count[]={0};
        hm.forEach((k,v)->{
            if(v%2==1){
                if(takenSingle[0]){
                    count[0]+=v-1;
                }
                else{
                    count[0]+=v;
                    takenSingle[0]=true;
                }
            }
            else{
                count[0]+=v;
            }
        });
        return count[0];
    }
    public static void main(String[] args) {
        System.out.println((new LongestPallindrome409Leet()).longestPalindrome("abccccdd"));
    }
}
