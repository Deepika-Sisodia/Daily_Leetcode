// Last updated: 9/10/2025, 12:39:12 PM
class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int ans = Integer.MAX_VALUE;
        for(int[] a : dp){
            Arrays.fill(a, -66666);
        }

        for(int col = 0; col<grid[0].length; col++){
            ans = Math.min(ans, min_path(grid, 0, col, dp));
        }
        return ans;
    }

    public static int min_path(int[][] grid, int cr, int cc, int[][] dp){
        if(cr == grid.length-1){
            return grid[cr][cc];
        }

        if(dp[cr][cc] != -66666){
            return dp[cr][cc];
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<grid[0].length; i++){
            if(i==cc){
                continue;
            }
            ans = Math.min(ans, min_path(grid, cr+1, i, dp)); 
        }
        return dp[cr][cc] = ans +  grid[cr][cc];
    }
}