public class SortColors75Leet {
    public static void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0,index=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                count0++;
            }
            if(nums[i]==1){
                count1++; 
            }
            if(nums[i]==2){
                count2++;
            }
       
    } 
    while(count0!=0){
        nums[index++]=0;
        count0--;
    }
    while(count1!=0){
        nums[index++]=1;
        count1--;
    }
    while(count2!=0){
        nums[index++]=2;
        count2--;
    }
    }
    public static void main(String[] args) {
        int []arr={2,0,1,1,0,2,1};
        sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
