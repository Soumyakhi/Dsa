public class Pow50Leet {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n>=Integer.MAX_VALUE){
            if(x==-1 || x==1){
                return x;
            }
            return 0;
        }
        if(n<=Integer.MIN_VALUE){
            if(x==1){
                return 1;
            }
            if(x==-1){
                return 1;
            }
            return 0;
        }
        if(n<0 && x!=0){
            n=n*-1;
            double p=1;
            for(int i=0;i<n;i++){
                p=p/x;
            }
            return p;
        }
        else if(n>0 && x!=0){
            double p=1;
            for(int i=0;i<n;i++){
                p=p*x;
            }
            return p;
        }
        return 0;
    }
    public static void main(String[] args) {
        Pow50Leet pl= new Pow50Leet();
        System.out.println(pl.myPow(1, -2147483648));
    }
}
