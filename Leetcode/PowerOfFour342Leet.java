public class PowerOfFour342Leet {
    public boolean isPowerOfFour(int n) {
        double x=Math.log((double)n)/Math.log(4);
        if(x==(int)(x) && x>=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new PowerOfFour342Leet()).isPowerOfFour(16));
    }
}
