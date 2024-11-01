public class RemoveTrailingZero2710Leet {
    public String removeTrailingZeros(String num) {
        for(int i=num.length()-1;i>-1;i--){
            if(num.charAt(i)!='0'){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println((new RemoveTrailingZero2710Leet()).removeTrailingZeros("51230100"));
    }
}
