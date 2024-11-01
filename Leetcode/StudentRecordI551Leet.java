public class StudentRecordI551Leet {
    public boolean checkRecord(String s) {
        int l=0,a=0,maxl=0;
        for (char chr : s.toCharArray()) {
            if(chr=='L'){
                l++;
                maxl=Math.max(l,maxl);
            }
            else{
                l=0;
                if(chr=='A'){
                    a++;
                }
            }
        }
        if(a>=2){
            return false;
        }
        if(maxl>=3){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((new StudentRecordI551Leet()).checkRecord("PPALLP"));
    }
}
