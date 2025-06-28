public class ShipDDays1011Leet {
    public int shipWithinDays(int[] weights, int days) {
        int low=1,high=maxCap(weights),res=high;
        while (low<=high) {
            int mid=low+(high-low)/2;
            boolean checkPossible=checkPossible(weights, mid,days);
            if(checkPossible){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    int maxCap(int []arr){
        int sum=0;
        for (int var : arr) {
            sum+=var;
        }
        return sum;
    }
    boolean checkPossible(int[] arr,int capacity,int days){
        int currentDays=0,weight=0;
        for (int i : arr) {
            if(i>capacity){
                return false;
            }
            if(i+weight>capacity){
                currentDays++;
                weight=i;
            }
            else{
                weight+=i;
            }
        }
        if(weight>0){
            currentDays++;
        }
        return currentDays<=days;
    }
    public static void main(String[] args) {
        
    }
}
