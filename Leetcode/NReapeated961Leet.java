import java.util.*;

public class NReapeated961Leet {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (Integer integer : nums) {
            if(set.contains(integer))
                return integer;
            set.add(integer);
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        System.out.println((new NReapeated961Leet()).repeatedNTimes(arr));
    }
}
