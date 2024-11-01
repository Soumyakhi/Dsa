public class MaxAreaIsland695Leet {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int max=0;
        int rows=grid.length,cols=grid[0].length;
        boolean isVisited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !isVisited[i][j]){
                    max=Math.max(dfs(grid, i, j, isVisited), max);
                    
                }
            }
        }
        return max;
    }
    int dfs(int [][]grid,int i,int j,boolean[][] isVisited){
        int rows = grid.length, cols = grid[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0 || isVisited[i][j]) {
            return 0;
        }
        isVisited[i][j] = true;
        int down=dfs(grid, i + 1, j, isVisited);
        int up=dfs(grid, i - 1, j, isVisited);
        int right=dfs(grid, i, j + 1, isVisited);
        int left=dfs(grid, i, j - 1, isVisited); 
        int res=1+up+down+right+left;
        return res;
    }
    public static void main(String[] args) {
        int grid[][]={
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println((new MaxAreaIsland695Leet()).maxAreaOfIsland(grid));
    }
}
