import java.util.LinkedList;
import java.util.*;

public class UnableToEat1700Leet {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> std=new LinkedList<>();
        Queue<Integer> sand=new LinkedList<>();
        for (Integer integer : students) {
            std.add(integer);
        }
        for (Integer integer : sandwiches) {
            sand.add(integer);
        }
        while(!sand.isEmpty() && !std.isEmpty()){
            if(!std.contains(sand.peek())){
                return std.size();
            }
            else if(sand.peek()!=std.peek()){
                std.add(std.poll());
            }
            else if(sand.peek()==std.peek()){
                sand.remove();
                std.remove();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] students={1,1,0,0};
        int[] sandwiches={0,1,0,1};
        System.out.println((new UnableToEat1700Leet()).countStudents(students, sandwiches));
    }
}
