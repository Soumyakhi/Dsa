import java.util.HashSet;

public class LongestConsecutiveSeq128Leet {
    public int longestConsecutive(int[] nums) {
        int maxLong=0;
        HashSet<Integer> hs=new HashSet<>();
        for (Integer integer : nums) {
            hs.add(integer);
        }
        for (Integer integer : nums){
            if(!hs.contains(integer-1)){
                int count=1;
                while (hs.contains(integer+count)) {
                    count++;
                }
                maxLong=Math.max(maxLong, count);
            }
            
        }
        return maxLong;
    }
    public static void main(String[] args) {
        int []arr={100,4,200,1,3,2};
        LongestConsecutiveSeq128Leet lc=new LongestConsecutiveSeq128Leet();
        System.out.println(lc.longestConsecutive(arr));
    }
}
