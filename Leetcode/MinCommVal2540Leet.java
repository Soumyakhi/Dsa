import java.util.HashSet;

public class MinCommVal2540Leet {
    /*public int getCommon(int[] nums1, int[] nums2) {
        int min=Integer.MAX_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                min=Math.min(min,nums2[i]);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }*/
    public int getCommon(int[] nums1, int[] nums2) {
        int p1=0,p2=0;
        while (p1<nums1.length && p2<nums2.length) {
            if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else if(nums1[p1]>nums2[p2]){
                p2++;
            }
            else{
                return nums1[p1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []a1={1,2,3};
        int a2[]={2,4};
        System.out.println((new MinCommVal2540Leet()).getCommon(a1, a2));
    }
}
