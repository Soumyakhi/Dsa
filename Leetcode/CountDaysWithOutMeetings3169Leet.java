import java.util.Arrays;
import java.util.Comparator;
public class CountDaysWithOutMeetings3169Leet {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        int last = 1;
        int count = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            if (last < start) {
                count += start - last;
            }
            last = Math.max(last, end + 1);
        }
        count += Math.max(days - last + 1, 0);

        return count;
    }

    public static void main(String[] args) {
        int meetings[][] = { { 2, 4 }, { 1, 3 } };
        System.out.println((new CountDaysWithOutMeetings3169Leet()).countDays(5, meetings));
    }
}
