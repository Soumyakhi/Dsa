public class ReplaceDigitsWithChar1844Leet {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                char c=(char)(s.charAt(i-1)+Character.getNumericValue(s.charAt(i)));
                sb.append(c);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new ReplaceDigitsWithChar1844Leet())
        .replaceDigits("a1b2c3d4e"));
    }
}
