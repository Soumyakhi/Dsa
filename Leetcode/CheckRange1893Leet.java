import java.util.HashSet;

public class CheckRange1893Leet {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<ranges.length;i++){
            int l=ranges[i][0];
            int r=ranges[i][1];
            for(int j=l;j<=r;j++){
                hs.add(j);
            }
        }
        for(int i=left;i<=right;i++){
            if(!hs.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,50}};
        CheckRange1893Leet ch=new CheckRange1893Leet();
        System.out.println(ch.isCovered(arr,1,50));
    }
}
