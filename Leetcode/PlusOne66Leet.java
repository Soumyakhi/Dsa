public class PlusOne66Leet{
    public int[] plusOne(int[] digits) {
        int count=0;
        boolean found=false;
        int i;
        for(i=digits.length-1;i>-1;i--){
            if(digits[i]!=9){
                found=true;
                break;
            }
            count++;
        }
        if(found==false){
            int []newArr=new int[digits.length+1];
            newArr[0]=1;
            return newArr;
        }
        int j=digits.length-1;
        while(count!=0){
            digits[j]=0;
            j--;
            count--;
        }
        digits[i]=digits[i]+1;
        return digits;
    }
    public static void main(String[] args) {
        int []brr={9};
        PlusOne66Leet po=new PlusOne66Leet();
        int []arr=po.plusOne(brr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}