public class ChocolatePickupGFG {
    int[][][] dp;

    public int solve(int n, int m, int[][] grid) {
        dp = new int[n][m][m];
        for (int i = 0; i < n; i++) {
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    dp[i][j1][j2] = -1;
                }
            }
        }
        return helper(0, 0, m - 1, grid);
    }

    int helper(int i, int j1, int j2, int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) {
            return Integer.MIN_VALUE;
        }
        if(i==n-1){
            if(j1==j2){
                return grid[i][j1];
            }
            return grid[i][j1]+grid[i][j2];
        }
        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }
        int maxChocolates = 0;
        int currentChocolates = (j1 == j2) ? grid[i][j1] : grid[i][j1] + grid[i][j2];
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 - 1, j2 - 1, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 - 1, j2, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 - 1, j2 + 1, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1, j2 - 1, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1, j2, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1, j2 + 1, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 + 1, j2 - 1, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 + 1, j2, grid));
        maxChocolates = Math.max(maxChocolates, helper(i + 1, j1 + 1, j2 + 1, grid));
        dp[i][j1][j2]=maxChocolates+currentChocolates;
        return maxChocolates+currentChocolates;
    }

    public static void main(String[] args) {
        int grid[][] = {{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}};
        System.out.println((new ChocolatePickupGFG()).solve(4, 3, grid));
    }
}
