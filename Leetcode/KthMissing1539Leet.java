public class KthMissing1539Leet {
    public int findKthPositive(int[] arr, int k) {
        if(arr[0] > k ){
            return k;
        }
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]-mid-1<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
    public static void main(String[] args) {
    }

}
