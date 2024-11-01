import java.util.ArrayList;
import java.util.HashMap;
public class IntersectionArrayii350Leet {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0){
            int arr[]={};
            return arr;
        }
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for (int i : nums1) {
            if(hm1.containsKey(i)){
                int sum=hm1.get(i)+1;
                hm1.put(i, sum);
            }
            else{
                hm1.put(i, 1);
            }
            
        }
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for (int i : nums2) {
            if(hm2.containsKey(i)){
                int sum=hm2.get(i);
                hm2.put(i, sum+1);
            }
            else{
                hm2.put(i, 1);
            }
        }
        HashMap<Integer,Integer> hm3=new HashMap<>();
        hm1.forEach((key, value) -> { 
            if(hm2.containsKey(key)){
                int value1=hm1.get(key);
                int value2=hm2.get(key);
                hm3.put(key, Math.min(value1,value2));
            }
        });
        ArrayList<Integer> al=new ArrayList<>();
        hm3.forEach((key, value) -> { 
            for(int i=1;i<=value;i++){
                al.add(key);
            }
        });
        int[] result = new int[al.size()];
        int index=0;
        for (Integer i : al) {
            result[index++]=i;
        }
        return result;
    }
    public static void main(String[] args) {
        IntersectionArrayii350Leet in=new IntersectionArrayii350Leet();
        int []arr1={1,2,2,1};
        int []arr2={2,2};
        int arr3[]=in.intersect(arr1, arr2);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
