import java.util.ArrayList;
public class FindCommonElement2956Leet{
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> hs1=new ArrayList<>();
        ArrayList<Integer>hs2=new ArrayList<>();
        for (int integer : nums1) {
            hs1.add(integer);
        }
        for (int integer : nums2) {
            hs2.add(integer);
        }
        int count1=0,count2=0;
        for (Integer integer : hs1) {
            if(hs2.indexOf(integer)!=-1){
                count1++;
            }
        }
        for (Integer integer : hs2) {
            if(hs1.indexOf(integer)!=-1){
                count2++;
            }
        }
        int resArr[]=new int[2];
        resArr[0]=count1;
        resArr[1]=count2;
        return resArr;
    }
    public static void main(String[] args) {
        int arr1[]={2,3,2};
        int arr2[]={1,2};
        FindCommonElement2956Leet fnd=new FindCommonElement2956Leet();
        int []arr3=fnd.findIntersectionValues(arr1, arr2);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}