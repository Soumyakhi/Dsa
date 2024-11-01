import java.util.HashSet;

public class DistinctRev2442Leet {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a>9){
                StringBuilder sb=new StringBuilder();
                int b=Integer.parseInt(sb.append(nums[i]).reverse().toString());
                hs.add(b);
            }
            hs.add(a);
            
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int n[]={1,13,10,12,31};
        System.out.println((new DistinctRev2442Leet()).countDistinctIntegers(n));
    }
}
