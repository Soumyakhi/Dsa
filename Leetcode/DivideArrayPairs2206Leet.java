import java.util.HashMap;

public class DivideArrayPairs2206Leet {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],+1);
            }
        }
        int []found=new int[1];
        hm.forEach((k,v)->{
            if(v%2!=0){
                found[0]=1;
            }
        });
        return found[0]==0;
    }
    public static void main(String[] args) {
        int []arr={3,2,3,2,2,2};
        System.out.println((new DivideArrayPairs2206Leet()).divideArray(arr));
    }
}
