public class SubstrSizeThree1876Leet {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()+1-3;i++){
            if((s.charAt(i)!=s.charAt(i+1)) &&(s.charAt(i)!=s.charAt(i+2))&&(s.charAt(i+1)!=s.charAt(i+2))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new SubstrSizeThree1876Leet()).countGoodSubstrings("xyzzaz"));
    }
}
