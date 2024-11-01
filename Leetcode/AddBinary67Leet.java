public class AddBinary67Leet {
    public String addBinary(String a, String b) {
        long num1=convertDecimal(a);
        long num2=convertDecimal(b);
        return Long.toBinaryString(num1+num2);
    }
    long convertDecimal(String number){
        if(number.charAt(0)=='0'){
            return 0;
        }
        long decimalNumber=1;
        for (int i = 0; i < number.length() - 1; i++) {
            decimalNumber = decimalNumber * 2 + Character.getNumericValue(number.charAt(i + 1));
        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        System.out.println((new AddBinary67Leet()).addBinary("0", 
        "0"));
    }
}
