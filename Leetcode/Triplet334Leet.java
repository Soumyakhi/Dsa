import java.util.HashSet;

public class Triplet334Leet {
    /*public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        if(hs.size()<3){
            return false;
        }
        for(int i=0;i<nums.length-2;i++){
            boolean found=false;
            for(int j=nums.length-2;j>i;j--){
                if(nums[i]<nums[j]){
                    for(int k=nums.length-1;k>j;k--){
                        if(nums[j]<nums[k]){
                            found=true;
                        }
                    }
                }
            }
            if(found){
                return found;
            }
        }
        return false;
    }*/
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int left=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=left){
                left=nums[i];
            }
            else if(nums[i]<=mid){
                mid=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Triplet334Leet tl=new Triplet334Leet();
        int []arr={20,100,10,12,5,13};
        System.out.println(tl.increasingTriplet(arr));
    }
}
