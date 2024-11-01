public class KokoBanana875Leet {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for (int i : piles) {
                if(i>max){
                    max=i;
                }
        }
        int min=max;
        int first=1,last=max;
        int mid;
        while(first<=last){
            mid=(first+last)/2;
            double sum=0;
            for (int i : piles) {
                sum=sum+ Math.ceil((double) i / mid);
            }
            if(sum<=h){
                min=Math.min(mid,min);
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int []arr={3,6,7,11};
        System.out.println((new KokoBanana875Leet())
        .minEatingSpeed(arr, 8));
    }
}
