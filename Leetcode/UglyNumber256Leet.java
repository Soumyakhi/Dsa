import java.util.ArrayList;

public class UglyNumber256Leet {
    /*public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        int numCount=0,number=2;
        while (numCount<=n) {
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    if(isPrime(i)){
                        al.add(i);
                    }
                }
            }
            boolean ugly=true;
            for (Integer element : al) {
                if(element!=2 && element !=3 && element!=5){
                    ugly=false;
                }
            }
            if(ugly){
                numCount++;
            }
            number++;
            
        }
        return number;
        
    }*/
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        ArrayList<Integer> al=new ArrayList<>();
        int number=1;
        while (al.size()<n) {
            int temp = number;
        
            while (temp % 2 == 0) {
                temp /= 2;
            }
            while (temp % 3 == 0) {
                temp /= 3;
            }
            while (temp % 5 == 0) {
                temp /= 5;
            }
            
            if (temp == 1) {
                al.add(number);
            }
            number++;
            
        }
        return al.get(n-1);
        
    }
    public static void main(String[] args) {
        UglyNumber256Leet un=new UglyNumber256Leet();
        System.out.println(un.nthUglyNumber(1352));
    }
}
