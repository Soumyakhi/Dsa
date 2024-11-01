public class CountPrime204Leet {
    /*boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }*/
    //optimized
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        boolean composite[]=new boolean[n];
        int count=0;
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){
            if(composite[i]==false){
                int j=i*i;
                while(j<n){
                    composite[j]=true;
                    j=j+i;
                }
            }
        }
        for(int i=2;i<composite.length;i++){
            if(composite[i]==false){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountPrime204Leet cp=new CountPrime204Leet();
        System.out.println(cp.countPrimes(10));
    }
}
