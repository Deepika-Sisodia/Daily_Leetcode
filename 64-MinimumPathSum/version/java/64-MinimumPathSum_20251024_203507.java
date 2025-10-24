// Last updated: 10/24/2025, 8:35:07 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        // for(int[] a : dp){
        //     Arrays.fill(a, -66666);
        // }
        // for(int col = 0; col<matrix[0].length; col++){
        //     ans = Math.min(ans, min_path(matrix, 0, col, dp));
        // }

        // return ans;

        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i=1; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j==0){
                    int c = matrix[i][j] + dp[i-1][j];
                    int rd = matrix[i][j] + dp[i-1][j+1];

                    dp[i][j] = Math.min(c,rd);
                }
                else if (j==dp[0].length-1){
                    int c = matrix[i][j] + dp[i-1][j];
                    int ld = matrix[i][j] + dp[i-1][j-1];

                    dp[i][j] = Math.min(c,ld);
                }

                else{
                    int c = matrix[i][j] + dp[i-1][j];
                    int ld = matrix[i][j] + dp[i-1][j-1];
                    int rd = matrix[i][j] + dp[i-1][j+1];

                    dp[i][j] = Math.min(c,Math.min(ld,rd));
                }
            }

            
        }

        for(int i=0; i<dp[0].length; i++){
            ans = Math.min(ans,dp[dp.length-1][i]);
        }

        return ans;
    }

    public static int min_path(int[][] matrix, int cr, int cc, int[][] dp){
        if(cc<0 || cc>=matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }

        if(dp[cr][cc] != -66666){
            return dp[cr][cc];
        }

        int ld = min_path(matrix, cr+1, cc-1,dp);
        int rd = min_path(matrix, cr+1, cc+1,dp);
        int d = min_path(matrix, cr+1, cc,dp);
        return dp[cr][cc] = Math.min(d, Math.min(ld,rd)) + matrix[cr][cc];
    }
}