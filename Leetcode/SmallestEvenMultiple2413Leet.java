public class SmallestEvenMultiple2413Leet {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<301;i+=2){
            if(i%n==0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        SmallestEvenMultiple2413Leet se=new SmallestEvenMultiple2413Leet();
        System.out.println(se.smallestEvenMultiple(5));
    }
}
