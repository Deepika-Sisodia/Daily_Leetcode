// Last updated: 10/21/2025, 8:02:24 PM
class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1){
            return 1;
        }
        // boolean[][] board = new boolean[m][n];
        int [][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=1; i<n; i++){
            dp[0][i] = 1;

        }

        for(int i=1; i<m; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        return dp[m-1][n-1];
    //    for(int i[]: dp){
    //     Arrays.fill(i,-1);
    //    }
       
    //    return paths(board,m,n,0,0,dp);
    }

    // public int paths(boolean board[][], int m, int n, int cr, int cc, int[][] dp){
    //     if(cr==m-1 && cc==n-1){
    //         return 1;
    //     }
    //     if(cr<0 || cc<0 || cr>m-1 || cc>n-1 || board[cr][cc]==true){
    //         return 0;
    //     }

    //     if(dp[cr][cc]!=-1){
    //         return dp[cr][cc];
    //     }

    //     board[cr][cc] = true;
    //     // down
    //     int p1 = paths(board,m,n,cr+1,cc,dp);
    //     // right
    //     int p2 = paths(board,m,n,cr,cc+1,dp);
    //     board[cr][cc] = false;

    //     return dp[cr][cc]=p1+p2;
    // }
}