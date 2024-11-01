import java.util.HashSet;

public class HappyNumber202 {
    public  boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        HashSet<Integer>hs=new HashSet<>();
        while(hs.contains(n)==false){
            hs.add(n);
            n=sumOfSquares(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
     int sumOfSquares(int n){
        int sum=0,r;
        while(n!=0){
            r=n%10;
            sum=sum+r*r;
            n=(int)n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        HappyNumber202 hn=new HappyNumber202();
        System.out.println(hn.isHappy(91999));
    }
}
