public class AddStrings415Leet {
    public String addStrings(String num1, String num2) {
        int index1=num1.length()-1,index2=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int rem=0;
        while (index1>-1 && index2>-1){
            int val1=Character.getNumericValue(num1.charAt(index1)),val2=Character.getNumericValue(num2.charAt(index2));
            int res=(val1+val2+rem)%10;
            sb.append(res);
            rem=(val1+val2+rem)/10;
            index1--;
            index2--;
        }
        while (index1!=-1) {
            int res=(Character.getNumericValue(num1.charAt(index1))+rem)%10;
            sb.append(res);
            rem=(Character.getNumericValue(num1.charAt(index1))+rem)/10;
            index1--;
        }
        while (index2!=-1) {
            int res=(Character.getNumericValue(num2.charAt(index2))+rem)%10;
            sb.append(res);
            rem=(Character.getNumericValue(num2.charAt(index2))+rem)/10;
            index2--;
        }
        if(rem!=0){
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println((new AddStrings415Leet()).addStrings("11", "123"));
    }
}
