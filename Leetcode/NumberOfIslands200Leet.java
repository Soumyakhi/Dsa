public class NumberOfIslands200Leet {
    public int numIslands(char[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int islands=0;
        int rows=grid.length,cols=grid[0].length;
        boolean isVisited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !isVisited[i][j]){
                    islands++;
                    dfs(grid, i, j, isVisited);
                }
            }
        }
        return islands;
    }
    private void dfs(char[][] grid, int i, int j, boolean[][] isVisited) {
        int rows = grid.length, cols = grid[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0' || isVisited[i][j]) {
            return;
        }
        isVisited[i][j] = true;
        dfs(grid, i + 1, j, isVisited);
        dfs(grid, i - 1, j, isVisited);
        dfs(grid, i, j + 1, isVisited);
        dfs(grid, i, j - 1, isVisited); 
    }

    public static void main(String[] args) {
        char [][]grid={{'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        System.out.println((new NumberOfIslands200Leet()).numIslands(grid));
    }
}
