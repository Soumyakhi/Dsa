public class ClearDigits3174Leet {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new ClearDigits3174Leet()).clearDigits("cb4"));
    }
}
