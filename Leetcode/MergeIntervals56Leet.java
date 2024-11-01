import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals56Leet {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> res=new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int lastEnd=res.get(res.size()-1)[1];
            int start=intervals[i][0],end=intervals[i][1];
            if(start<=lastEnd){
                res.get(res.size()-1)[1]=Math.max(lastEnd, end);
            }
            else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
    public static void main(String[] args) {
        int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
        intervals=(new MergeIntervals56Leet()).merge(intervals);
        for (int[] is : intervals) {
            System.out.println(Arrays.toString(is));
        }
    }
}
