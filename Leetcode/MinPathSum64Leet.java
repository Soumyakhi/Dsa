import java.util.HashMap;

class MinPathSum64Leet{
    public int minPathSum(int[][] grid) {
        return helper(0, 0, grid,new HashMap<>());
    }
    int helper(int i,int j,int[][]grid,HashMap<String,Integer> hm){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        String key=i+","+j;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int right=helper(i, j+1, grid,hm);
        int down=helper(i+1, j, grid,hm);
        int res=grid[i][j]+Math.min(right, down);
        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println((new MinPathSum64Leet()).minPathSum(grid));
    }
}