public class Power2Of231Leet {
    /*public boolean isPowerOfTwo(int n) {
        double d=Math.log((long)n)/Math.log(2);
        return d==(long)d;
    }*/
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Power2Of231Leet pw=new Power2Of231Leet();
        System.out.println(pw.isPowerOfTwo(0));
    }
}
