public class PallindromicSubStrings647Leet {
    public int countSubstrings(String s) {
        int count=s.length();
        for(int i=0;i<s.length();i++){
            int l=i-1,r=i+1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    count++;
                    l--;
                    r++;
                } else {
                    break;
                }
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                continue;
            }
            count++;
            int l=i-1,r=i+2; 
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    count++;
                    l--;
                    r++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new PallindromicSubStrings647Leet()).countSubstrings("aaa"));
    }
}
