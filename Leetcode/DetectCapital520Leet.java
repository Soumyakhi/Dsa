public class DetectCapital520Leet {
    public boolean detectCapitalUse(String word) {
        int capIndex=-1,capCount=0;
        for(int i=word.length()-1;i>-1;i--){
            if(Character.toUpperCase(word.charAt(i))==word.charAt(i)){
                capIndex=i;
                capCount++;
            }
        }
        if(capCount==word.length() || capCount==0){
            return true;
        }
        if(capCount==1 && capIndex==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new DetectCapital520Leet()).detectCapitalUse("USA"));
    }
}
