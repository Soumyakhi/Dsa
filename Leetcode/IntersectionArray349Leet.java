import java.util.HashSet;

public class IntersectionArray349Leet {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0){
            int arr[]={};
            return arr;
        }
        HashSet<Integer> hs1=new HashSet<>();
        for (int element : nums1) {
            hs1.add(element);
        }
        HashSet<Integer> hs2=new HashSet<>();
        for (int element : nums2) {
            hs2.add(element);
        }
        HashSet<Integer> hs3=new HashSet<>();
        for (Integer integer : hs1) {
            if(hs2.contains(integer)){
                hs3.add(integer);
            }
        }
        int result[]=new int[hs3.size()];
        int index=0;
        for (Integer i : hs3) {
            result[index]=i;
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr1={1,2,2,1};
        int []arr2={2,2};
        IntersectionArray349Leet in=new IntersectionArray349Leet();
        int arr3[]=in.intersection(arr1, arr2);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
