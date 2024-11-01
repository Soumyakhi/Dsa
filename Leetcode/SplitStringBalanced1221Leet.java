public class SplitStringBalanced1221Leet {
    public int balancedStringSplit(String s) {
        int start=0,end=2;
        int res=0;
        while (end<=s.length()) {
            int countR=0,countL=0;
            for(int i=start;i<end;i++){
                if(s.charAt(i)=='R'){
                    countR++;
                }
                else{
                    countL++;
                }
            }
            if(countR==countL){
                res++;
                start=end;
                end=start+2;
            }
            else{
                end+=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new SplitStringBalanced1221Leet()).balancedStringSplit("RLRRLLRLRL"));
    }
}
