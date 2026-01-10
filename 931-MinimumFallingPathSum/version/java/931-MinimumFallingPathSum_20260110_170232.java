// Last updated: 1/10/2026, 5:02:32 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int[][] dp = new int[m][n];
7        for(int i=0; i<n; i++){
8            dp[0][i] = matrix[0][i];
9        }
10
11        for(int i=1; i<m; i++){
12            for(int j=0; j<n; j++){
13                if(j==0){
14                    int c = dp[i-1][j];
15                    int rd = dp[i-1][j+1];
16                    dp[i][j] = matrix[i][j] + Math.min(c,rd);
17                }
18                else if(j==n-1){
19                    int ld = dp[i-1][j-1];
20                    int c = dp[i-1][j];
21                    dp[i][j] = matrix[i][j] + Math.min(c,ld);
22                }
23                else{
24                    int ld = dp[i-1][j-1];
25                    int c = dp[i-1][j];
26                    int rd = dp[i-1][j+1];
27
28                    dp[i][j] = matrix[i][j] + Math.min(c,Math.min(ld,rd));
29                }
30            }
31        }
32        int min = Integer.MAX_VALUE;
33        for(int i=0; i<n; i++){
34            min = Math.min(dp[m-1][i],min);
35        }
36
37        return min;
38    }
39}