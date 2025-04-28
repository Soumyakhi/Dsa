
import java.util.Arrays;

public class CorpFlight1109Leet {
    /*public int[] corpFlightBookings(int[][] bookings, int n) {
        int sum[]=new int[n];
        for(int i=0;i<bookings.length;i++){
            for(int j=bookings[i][0];j<=bookings[i][1];j++){
                sum[j-1]+=bookings[i][2];
            }
        }
        return sum;
    }*/
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] sum = new int[n];
        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int seats = booking[2];
            
            sum[start] += seats;
            if (end + 1 < n) {
                sum[end + 1] -= seats;
            }
        }
        for (int i = 1; i < n; i++) {
            sum[i] += sum[i - 1];
        }
        return sum;
    }    
    public static void main(String[] args) {
        int arr[][]={{1,2,10},{2,3,20},{2,5,25}};
        System.out.println(Arrays.toString((new CorpFlight1109Leet()).corpFlightBookings(arr,5)));
    }
}
