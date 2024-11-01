public class HalvesAlike1704Leet {
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' 
        || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        int v1=0,v2=0;
        for(int i=0;i<len/2;i++){
            if(isVowel(s.charAt(i))){
                v1++;
            }
        }
        for(int i=len/2;i<len;i++){
            if(isVowel(s.charAt(i))){
                v2++;
            }
        }
        return v1==v2;
    }
    public static void main(String[] args) {
        System.out.println((new HalvesAlike1704Leet()).halvesAreAlike("textbook"));
    }
}
