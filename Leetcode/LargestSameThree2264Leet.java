public class LargestSameThree2264Leet {
    public String largestGoodInteger(String num) {
        int maxDigit=-1;
        int i=0;
        while (i<num.length()-2) {
            char chr=num.charAt(i);
            if(chr == num.charAt(i+1) && chr==num.charAt(i+2)){
                maxDigit=Math.max(maxDigit, Character.getNumericValue(chr));
                i+=3;
            }
            else{
                i++;
            }
        }
        if(maxDigit==-1){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        sb.append(maxDigit);
        sb.append(maxDigit);
        sb.append(maxDigit);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new LargestSameThree2264Leet()).largestGoodInteger("6777133339"));
    }
}
