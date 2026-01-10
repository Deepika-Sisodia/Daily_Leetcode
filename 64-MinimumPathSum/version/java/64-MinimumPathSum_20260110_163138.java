// Last updated: 1/10/2026, 4:31:38 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int[][] dp = new int[m][n];
6
7        int sr = 0;
8        for(int i=0; i<m; i++){
9            sr+=grid[i][0];
10            dp[i][0] = sr;
11        }
12        int sc  = 0;
13        for(int i=0; i<n; i++){
14            sc+=grid[0][i];
15            dp[0][i] = sc;
16        }
17
18        for(int i=1; i<m; i++){
19            for(int j=1; j<n; j++){
20                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
21            }
22        }
23
24        return dp[m-1][n-1];
25    }
26}