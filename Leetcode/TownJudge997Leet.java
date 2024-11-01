import java.util.HashSet;

public class TownJudge997Leet {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> hs=new HashSet<>();
        for (int[] arr: trust) {
            hs.add(arr[0]);
        }
        for (int i=1;i<=n;i++) {
            if (!hs.contains(i)) {
                int trustCount = 0;
                for (int[] arr : trust) {
                    if (arr[1] == i) {
                        trustCount++;
                    }
                }
                if (trustCount==n-1) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][]arr={{1,3},{2,3}};
        System.out.println((new TownJudge997Leet()).findJudge(3, arr));
    }
}
