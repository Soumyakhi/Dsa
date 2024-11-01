import java.util.HashSet;

public class SmallestNoArray2605Leet {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
            min1=Math.min(min1, nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                min3=Math.min(min3, nums2[i]);
            }
            min2=Math.min(min2, nums2[i]);
        }
        if(min3!=Integer.MAX_VALUE){
            return min3;
        }
        int a=10*min1+min2,b=10*min2+min1;
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        int []nums={3,5,2,6};
        int []nums1={3,1,7};
        System.out.println((new SmallestNoArray2605Leet()).minNumber(nums, nums1));
    }
}
