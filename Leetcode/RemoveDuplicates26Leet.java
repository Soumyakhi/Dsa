import java.util.HashSet;

public class RemoveDuplicates26Leet {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i])==false){
                arr.add(nums[i]);
            }
        }
        int i=0;
        for (Integer element : arr) {
            System.out.println(element);
            nums[i]=element;
            i++;
        }
        return arr.size();
    }
    public static void main(String[] args) {
        RemoveDuplicates26Leet rm=new RemoveDuplicates26Leet();
        int []nums={0,1,2,3,4};
        System.out.println(rm.removeDuplicates(nums));
    }
}
