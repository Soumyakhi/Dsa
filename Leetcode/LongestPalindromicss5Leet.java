public class LongestPalindromicss5Leet {
    public String longestPalindrome(String s) {
        String subString=Character.toString(s.charAt(0));
        for(int i=0;i<s.length();i++){
            int l=i-1,r=i+1;
            String st=Character.toString(s.charAt(i));
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    st = s.substring(l, r + 1);
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            if(st.length()>subString.length()){
                subString=st;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                continue;
            }
            int l=i-1,r=i+2;
            String st=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
             
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    st = s.substring(l, r + 1);
                    l--;
                    r++;
                } else {
                    break;
                }
            }
        
            if(st.length()>subString.length()){
                subString=st;
            }
        }
        return subString;
    }
    public static void main(String[] args) {
        System.out.println((new LongestPalindromicss5Leet()).longestPalindrome("cbbd"));
    }
}
