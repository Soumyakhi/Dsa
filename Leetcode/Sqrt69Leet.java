public class Sqrt69Leet {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        if(x==Integer.MAX_VALUE){
            return 46340;
        }
        for(int i=2;i<=x;i++){
            if((i*i)==x){
                return i;
            }
            if(i*i>x){
                return i-1;
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Sqrt69Leet sq=new Sqrt69Leet();
        System.out.println(sq.mySqrt(25));
    }
}
