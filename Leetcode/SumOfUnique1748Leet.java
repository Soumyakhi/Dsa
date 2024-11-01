import java.util.HashMap;

public class SumOfUnique1748Leet {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : nums) {
            if(hm.containsKey(i)){
                hm.put(i, 2);
            }
            else{
                hm.put(i, 1);
            }
        }
        int sum=0;
        for (int i : nums) {
            if(hm.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,2};
        System.out.println((new SumOfUnique1748Leet()).sumOfUnique(nums));
    }
}
