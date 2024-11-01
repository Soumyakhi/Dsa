public class ValidWord3136Leet {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vCount=0,cCount=0;
        for(int i=0;i<word.length();i++){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' 
            || word.charAt(i)=='u' || word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I'
            || word.charAt(i)=='O' || word.charAt(i)=='U'){
                vCount++;
            }
            else{
                if(Character.isLetter(word.charAt(i))){
                    cCount++;
                }
            }
            
        }
        if(vCount>0 && cCount>0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidWord3136Leet vl=new ValidWord3136Leet();
        System.out.println(vl.isValid("234adas"));
    }
    //It contains a minimum of 3 characters.
    //It contains only digits (0-9), and English letters (uppercase and lowercase).
    //It includes at least one vowel.
    //It includes at least one consonant.
}

