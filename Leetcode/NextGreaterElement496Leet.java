public class NextGreaterElement496Leet {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int ind=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ind=j;
                    break;
                }
            }
            int index=-1;
            for(int j=ind;j<nums2.length;j++){
                if(nums2[ind]<nums2[j]){
                    index=j;
                    break;
                }
            }
            if(index==-1){
                nums1[i]=-1;
            }
            else{
                nums1[i]=nums2[index];
            }

        }
        return nums1;
    }
    public static void main(String[] args) {
        int []nums1={4,1,2};
        int nums2[]={1,3,4,2};
        int []res=(new NextGreaterElement496Leet()).nextGreaterElement(nums1, nums2);
        for (int i : res) {
            System.out.print(i+" ");
        }
        
    }
}
