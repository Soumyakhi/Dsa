public class RepeatedSubString459Leet {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<(s.length()/2)+1;i++){
            for(int j=0;j<s.length()/i;j++){
                sb.append(s.substring(0, i));
            }
            if(s.equals(sb.toString())){
                return true;
            }
            sb.delete(0, sb.length());
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new RepeatedSubString459Leet()).repeatedSubstringPattern("abcabc"));
    }
}
