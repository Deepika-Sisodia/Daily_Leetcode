// Last updated: 10/24/2025, 6:42:24 PM
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j] = -1;
        //     }
        // }
        // return Minimum_Path(grid,0,0,dp);
        dp[0][0] = grid[0][0];
        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }

        for(int i=1; i<dp.length; i++){
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    public static int Minimum_Path(int[][] grid, int cr, int cc, int[][] dp){
        if(cr == grid.length-1 && cc == grid[0].length-1){
            return grid[cr][cc];

        }
        if(cc == grid[0].length || cr == grid.length){
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }

        int d = Minimum_Path(grid, cr+1, cc,dp);
        int r = Minimum_Path(grid, cr, cc+1,dp);
        return dp[cr][cc] = Math.min(d,r) + grid[cr][cc];
    }
}