public class KokoBananas875Leet {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=max(piles),res=high;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int time=timeTaken(piles, mid);
            if(time<=h){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    int max(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            max=Math.max(max, i);
        }
        return max;
    }
    int timeTaken(int[] arr,int unit){
        int time=0;
        for (int i : arr) {
            time+=Math.ceil((double)i/unit);
        }
        return time;
    }
    public static void main(String[] args) {
        int []arr={3,6,7,11};
        System.out.println((new KokoBananas875Leet()).minEatingSpeed(arr,8));
    }
}
