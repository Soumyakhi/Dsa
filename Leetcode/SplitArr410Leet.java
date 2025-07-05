public class SplitArr410Leet {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k){
            return -1;
        }
        int lowHigh[]=findLowAndHigh(nums);
        int low=lowHigh[0],high=lowHigh[1],ans=-1;
        if(k==1){
            return high;
        }
        while (low<=high) {
            int mid=low+(high-low)/2;
            int arrParts=partitions(nums, mid);
            if(arrParts<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    int[] findLowAndHigh(int[] nums){
        int arr[]={Integer.MIN_VALUE,0};
        for (int i : nums) {
            arr[0]=Math.max(arr[0], i);
            arr[1]+=i;
        }
        return arr;
    }
    int partitions(int []nums,int maxAllowedSum){
        int arrNo=1,sum=0;
        for (int i : nums) {
            if(sum+i<=maxAllowedSum){
                sum+=i;
            }
            else{
                arrNo++;
                sum=i;
            }
        }
        return arrNo;
    }
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        System.out.println((new SplitArr410Leet()).splitArray(arr, 2));
    }
}
