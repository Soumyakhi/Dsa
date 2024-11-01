import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray88Leet {
    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[index++];
        }
        Arrays.sort(nums1);
    }*/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=0,last=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(first<m && last<n){
            if(nums1[first]<nums2[last]){
                al.add(nums1[first++]);
            }
            else{
                al.add(nums2[last++]);
            }  
        }
        while(first<m){
            al.add(nums1[first++]);
        }
        while(last<n){
            al.add(nums2[last++]);
        }
        int index=0;
        for (Integer integer : al) {
            nums1[index++]=integer;
        }
    }
    public static void main(String[] args) {
        
    }
}
