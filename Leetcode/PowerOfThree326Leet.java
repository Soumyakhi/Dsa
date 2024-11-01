public class PowerOfThree326Leet {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        System.out.println((new PowerOfThree326Leet()).isPowerOfThree(243));
    }
}
