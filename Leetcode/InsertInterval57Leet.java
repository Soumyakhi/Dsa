import java.util.ArrayList;
public class InsertInterval57Leet {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                al.add(intervals[i]);
            } else if (intervals[i][0] > newInterval[1]) {
                if (!inserted) {
                    al.add(newInterval);
                    inserted = true;
                }
                al.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!inserted) {
            al.add(newInterval);
        }

        return al.toArray(new int[al.size()][]);
    }
    public static void main(String[] args) {
       
    }
}
