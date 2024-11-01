public class PerfectSq367Leet {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int lim=num;
        int l=1;
        int mid;
        while (l<=lim) {
            mid=((l+lim)/2);
            int quotient = num / mid;
            if(mid == quotient && num % mid == 0){
                return true;
            }
            if(mid < quotient){
                l=mid+1;
            }
            else{
                lim=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new PerfectSq367Leet()).isPerfectSquare(2147483647));
    }
}
