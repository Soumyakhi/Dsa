public class MaxVowels1456Leet {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=1;i<s.length()-k+1;i++){
            if(isVowel(s.charAt(i-1))){
                count--;
            }
            if(isVowel(s.charAt(i+k-1))){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' ||
        c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new MaxVowels1456Leet()).maxVowels("weallloveyou", 7));
    }
}
