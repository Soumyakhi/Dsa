public class ExistingStringRev3083Leet {
    public boolean isSubstringPresent(String s) {
        if(s.length()<2){
            return false;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        String rev=(new StringBuilder(s)).reverse().toString();
        if(rev.contains(sb.toString())){
            return true;
        }
        for(int i=2;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(rev.contains(sb.toString())){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new ExistingStringRev3083Leet()).isSubstringPresent("leetcode"));
    }
}
