import java.util.HashMap;

public class OutOfBoundaryPaths576Leet {
    private static final int MOD = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        return helper(m, n, maxMove, startRow, startColumn,new HashMap<>());
    }
    int helper(int m, int n, int maxMove, int startRow, int startColumn,HashMap<String,Integer> hm){
        if(startRow==m || startRow<0 || startColumn==n || startColumn<0){
            return 1;
        }
        if(maxMove==0){
            return 0;
        }
        String key=startRow+","+startColumn+","+maxMove;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int totalWays;
        int up=helper(m, n, maxMove-1, startRow-1, startColumn,hm)% MOD;
        int down=helper(m, n, maxMove-1, startRow+1, startColumn,hm)% MOD;
        int left=helper(m, n, maxMove-1, startRow, startColumn-1,hm)% MOD;
        int right=helper(m, n, maxMove-1, startRow, startColumn+1,hm)% MOD;
        totalWays=(up+down+right+left)% MOD;
        hm.put(key, totalWays);
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println((new OutOfBoundaryPaths576Leet()).findPaths(2, 2, 2, 0, 0));
    }
}
