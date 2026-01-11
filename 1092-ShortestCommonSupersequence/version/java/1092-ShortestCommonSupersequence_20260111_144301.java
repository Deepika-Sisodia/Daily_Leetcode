// Last updated: 1/11/2026, 2:43:01 PM
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int n = str1.length();
4        int m = str2.length();
5        int[][] dp = new int[n+1][m+1];
6
7        for(int i=1; i<=n; i++){
8            for(int j=1; j<=m; j++){
9                if(str1.charAt(i-1)==str2.charAt(j-1)){
10                    dp[i][j] = 1 + dp[i-1][j-1];
11                }
12                else{
13                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
14                }
15            }
16        }
17        StringBuilder sb = new StringBuilder();
18        int i = n, j = m;
19        while(i>0 && j>0){
20            if(str1.charAt(i-1)==str2.charAt(j-1)){
21                sb.append(str1.charAt(i-1));
22                i--;
23                j--;
24            }
25            else if(dp[i-1][j]>dp[i][j-1]){
26                sb.append(str1.charAt(i-1));
27                i--;
28            }
29            else{
30                sb.append(str2.charAt(j-1));
31                j--;
32            }
33        }
34        while(i>0){
35            sb.append(str1.charAt(i-1));
36            i--;
37        }
38        while(j>0){
39            sb.append(str2.charAt(j-1));
40            j--;
41        }
42
43        return sb.reverse().toString();
44    }
45}