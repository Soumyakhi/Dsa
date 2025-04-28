import java.util.HashMap;
import java.util.Map;

public class SubArrSum560Leet {
    /*public int subarraySum(int[] nums, int k) {
        int []prefArr=new int[nums.length];
        int sum=nums[0];
        prefArr[0]=nums[0];
        for(int i=1;i<prefArr.length;i++){
            sum+=nums[i];
            prefArr[i]=sum;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                int res=0;
                if(j!=0){
                    res = prefArr[i] - prefArr[j-1]; 
                }
                else{
                    res=prefArr[i];
                }
                if(res==k){
                    count++;
                }
            }
        }
        return count;
    }*/
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); 
    int sum = 0, count = 0;

    for (int num : nums) {
        sum += num;
        count += map.getOrDefault(sum - k, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}
    public static void main(String[] args) {
        int arr[]={1,1,1};
        System.out.println((new SubArrSum560Leet()).subarraySum(arr, 2));
    }
}
