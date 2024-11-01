import java.util.*;

public class MiniMumGame2974Leet {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int []brr=new int[nums.length];
        Queue<Integer> q=new LinkedList<>();
        for (Integer integer : nums) {
            q.add(integer);
        }
        int index=0;
        while(q.isEmpty()==false){
            int alice=q.poll();
            if(q.isEmpty()==false){
                int bob=q.poll();
                brr[index++]=bob;
            }
            brr[index++]=alice;
        }
        return brr;
    }
    public static void main(String[] args) {
        int []arr={5,4,2,3};
        MiniMumGame2974Leet mn=new MiniMumGame2974Leet();
        int []brr=mn.numberGame(arr);
        for (int i : arr) {
            System.out.println(i); 
        }
    }
}
