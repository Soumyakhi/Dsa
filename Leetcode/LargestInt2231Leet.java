import java.util.*;
public class LargestInt2231Leet {
    public int largestInteger(int num) {
        String s=Integer.toString(num);
        char c[]=s.toCharArray();
        PriorityQueue<Integer> pqEven=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqOdd=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<c.length;i++) {
            int number=Character.getNumericValue(c[i]);
            if(number%2==0){
                pqEven.offer(number);
            }
            else{
                pqOdd.offer(number);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<c.length;i++) {
            int number=Character.getNumericValue(c[i]);
            if(number%2==0){
                c[i]=Character.forDigit(pqEven.poll(), 10);
            }
            else{
                c[i]=Character.forDigit(pqOdd.poll(), 10);
            }
        }
        for (char chr : c) {
            sb.append(chr);
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        System.out.println((new LargestInt2231Leet()).largestInteger(65875));
    }
}
