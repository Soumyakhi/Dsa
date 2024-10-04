public class Recursion {
    static void printNums(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        printNums(n-1);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        
        else{
            return n*factorial(n-1);
        }
        
    }
    static int sumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        
        else{
            return n+sumOfNumbers(n-1);
        }
        
    }
    static int power(int x,int pow){
        if(pow==0){
            return 1;
        }
        
        else{
            return x*power(x,pow-1);
        }
        
    }
    static void fibonacci(int prev1,int prev2,int max,int t){
        t++;
        System.out.print(prev1+prev2+" ");
        if(t==max){ 
            return;
        }
        else{
            fibonacci(prev2,prev1+prev2, max, t);
        }
        
    }
    static long powerLog(int x,int pow){
        
        if(pow==0){
            return 1;
        }
        else if(pow%2==0)
        {   
            return power(x,pow/2)*power(x,pow/2);
        }
        
        else{
            return x*power(x,pow/2)*power(x,pow/2);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("print numbers");
        printNums(5);
        System.out.println("factorial");
        System.out.println(factorial(5));
        System.out.println("sum of numbers");
        System.out.println(sumOfNumbers(5));
        System.out.println("fibonacci");
        System.out.print(0+" ");
        System.out.print(1+" ");
        fibonacci(0,1, 10, 2);
        System.out.println();
        System.out.println("power");
        System.out.println(power(2,10));
        System.out.println("power logn");
        System.out.println(powerLog(2,10));
    }
}
