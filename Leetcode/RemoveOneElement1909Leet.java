import java.util.ArrayList;
public class RemoveOneElement1909Leet {
    public boolean canBeIncreasing(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            return true;
        }
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==index){
                continue;
            }
            al1.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i==index+1){
                continue;
            }
            al2.add(nums[i]);
        }
        
        return isStrictlyIncreasing(al1)||isStrictlyIncreasing(al2);
    }
    boolean isStrictlyIncreasing(ArrayList<Integer> al){
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={1,2,10,5,7};
        System.out.println((new RemoveOneElement1909Leet()).canBeIncreasing(nums));
    }
}
