import java.util.HashSet;
import java.util.Set;

public class CountPairsDayone3184Leet {
    public int countCompleteDayPairs(int[] hours) {
        int count=0;
        for(int i=0;i<hours.length-1;i++){
            for(int j=i+1;j<hours.length;j++){
                if((hours[i]+hours[j])%24==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={12,12,30,24,24};
        System.out.println((new CountPairsDayone3184Leet()).countCompleteDayPairs(arr));
    }
}
