import java.util.HashMap;

public class DegreeofanArray697Leet {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if(!firstOccurrence.containsKey(nums[i])){
                firstOccurrence.put(nums[i], i);
            }
            if(freqMap.containsKey(nums[i])){
                freqMap.put(nums[i], freqMap.get(nums[i])+1);
            }
            else{
                freqMap.put(nums[i], 1);
            }
            lastOccurrence.put(nums[i], i);
        }
        int []max=new int[1];
        freqMap.forEach((k,v)->{
            max[0]=Math.max(max[0], v);
        });
        int minSub=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if(freqMap.get(nums[i])==max[0]){
                minSub=Math.min(minSub, lastOccurrence.get(nums[i])-firstOccurrence.get(nums[i])+1);
            }
        }
        return minSub;
    }
    public static void main(String[] args) {
        int []nums={1,2,2,3,1};
        System.out.println((new DegreeofanArray697Leet()).findShortestSubArray(nums));
    }
}
