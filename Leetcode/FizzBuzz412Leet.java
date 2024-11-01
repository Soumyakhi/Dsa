import java.util.ArrayList;

public class FizzBuzz412Leet {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                al.add("FizzBuzz");
            }
            else if(i%3==0){
                al.add("Fizz");
            }
            else if(i%5==0){
                al.add("Buzz");
            }
            else{
                al.add(Integer.toString(i));
            }
        }
        return al;
    }
    public static void main(String[] args) {
        System.out.println((new FizzBuzz412Leet()).fizzBuzz(3));
    }
}
