import java.util.HashMap;

public class UniquePathsII63Leet {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1){
            return 0;
        }
        return totalWays(0, 0, obstacleGrid,new HashMap<>());
    }
    int totalWays(int i,int j,int[][] obstacleGrid,HashMap<String,Integer> hm){
        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
            return 1;
        }
        if(i>=obstacleGrid.length || j>=obstacleGrid[0].length){
            return 0;
        }
        if(obstacleGrid[i][j]==1){
            return 0;
        }
        String key=i+","+j;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int down=totalWays(i+1, j, obstacleGrid,hm);
        int right=totalWays(i, j+1, obstacleGrid,hm);
        int res= right+down;
        hm.put(key,res);
        return res;
    }
    public static void main(String[] args) {
        int [][]arr={{0,1},{0,0}};
        System.out.println((new UniquePathsII63Leet()).uniquePathsWithObstacles(arr));
    }
}
