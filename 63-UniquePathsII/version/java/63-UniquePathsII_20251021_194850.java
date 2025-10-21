// Last updated: 10/21/2025, 7:48:50 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return paths(obstacleGrid,0,0,m,n,dp);
    }

    public int paths(int[][] grid, int cr, int cc, int m, int n, int[][] dp){
        if(cr<0 || cc<0 || cr>=m || cc>=n || grid[cr][cc]==1){
            return 0;
        }

        if(cr==m-1 && cc==n-1){
            return 1;
        }

        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }

        int down = paths(grid,cr+1,cc,m,n,dp);
        int right = paths(grid,cr,cc+1,m,n,dp);

        return dp[cr][cc] = down + right;
    }
}