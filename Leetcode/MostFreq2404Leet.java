import java.util.HashMap;

public class MostFreq2404Leet {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(hm.containsKey(nums[i])){
                    hm.put(nums[i], hm.get(nums[i])+1);
                }
                else{
                    hm.put(nums[i], 1);
                }
            }
        }
        int arr[]=new int[2];
        arr[0]=Integer.MAX_VALUE;
        hm.forEach((k,v)->{
            if(v>arr[1]){
                arr[0]=k;
                arr[1]=v;
            }
            else if(v==arr[1]){
                arr[0]=Math.min(arr[0], k);
            }
        });
        if(arr[1]==0){
            return -1;
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int []nums={0,1,2,2,4,4,1};
        System.out.println((new MostFreq2404Leet()).mostFrequentEven(nums));
    }
}
