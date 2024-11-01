import java.util.HashSet;

public class TriangleType3024Leet {
    public String triangleType(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for (int integer : nums) {
            hs.add(integer);
        }
        if(hs.size()==1){
            return "equilateral";
        }
        if(hs.size()==2){
            if(nums[0]+nums[1]>nums[2] && nums[2]+nums[1]>nums[0] && nums[0]+nums[2]>nums[1])
            return "isosceles";
        }
        if(hs.size()==3){
            if(nums[0]+nums[1]>nums[2] && nums[2]+nums[1]>nums[0] && nums[0]+nums[2]>nums[1])
            return "scalene";
        }
        return "none";
    }
    public static void main(String[] args) {
        int []arr={3,3,3};
        System.out.println((new TriangleType3024Leet()).triangleType(arr));
    }
}
