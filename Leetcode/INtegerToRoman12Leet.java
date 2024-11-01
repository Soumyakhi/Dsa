public class INtegerToRoman12Leet {
    public String intToRoman(int num) {
        int rem=num;
        StringBuilder sb=new StringBuilder();
        if(rem>1000){
            for(int i=0;i<rem/1000;i++){
                sb.append("M");
            }
            rem=rem%1000;
        }
        if(rem>=900 && rem<=999){
                sb.append("CM");
                rem=rem-900;
        }
        if(rem>=400 && rem<=499){
            sb.append("CD");
            rem=rem-400;
        }
        if(rem>500){
            for(int i=0;i<rem/500;i++){
                    sb.append("D");
            }
            rem=rem%500;
        }
        if(rem>100){
            for(int i=0;i<rem/100;i++){
                sb.append("C");
            }
            rem=rem%100;
        }
        if(rem>=90 && rem<=99){
            sb.append("XC");
            rem=rem-90;
        }
        if(rem>=40 && rem<=49){
            sb.append("XL");
            rem=rem-40;
        }
        if(rem>50){
            for(int i=0;i<rem/50;i++){
                    sb.append("L");
            }
            rem=rem%50;
        }
        if(rem>10){
            for(int i=0;i<rem/10;i++){
                    sb.append("X");
            }
            rem=rem%10;
        }
        if(rem==9){
            sb.append("IX");
            rem=0;
        }
        if(rem==8){
            sb.append("VIII");
            rem=0;
        }
        if(rem==7){
            sb.append("VII");
            rem=0;
        }
        if(rem==6){
            sb.append("VI");
            rem=0;
        }
        if(rem==4){
            sb.append("IV");
            rem=0;
        }
        if(rem==3){
            sb.append("III");
            rem=0;
        }
        if(rem==2){
            sb.append("II");
            rem=0;
        }
        if(rem==1){
            sb.append("I");
            rem=0;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new INtegerToRoman12Leet()).intToRoman(3749));
    }
}
