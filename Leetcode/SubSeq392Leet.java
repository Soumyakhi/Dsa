public class SubSeq392Leet {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        int i;
        for(i=0;i<s.length();i++){
            int found=0;
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    found=1;
                    t=t.substring(j+1);
                    break;
                }
            }
            if(found==0){
                break;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        SubSeq392Leet ss=new SubSeq392Leet();
        System.out.println(ss.isSubsequence("abch", "ahbgdc"));
    }
}
