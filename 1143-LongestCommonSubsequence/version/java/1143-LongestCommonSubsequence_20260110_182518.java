// Last updated: 1/10/2026, 6:25:18 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()][text2.length()];
4        for(int[] i: dp){
5            Arrays.fill(i,-1);
6        }
7        return LCS(text1,text2,0,0,dp);
8    }
9
10    public int LCS(String s1, String s2, int i, int j, int[][] dp){
11        if(i==s1.length() || j==s2.length()){
12            return 0;
13        }
14
15        int ways = 0;
16
17        if(dp[i][j]!=-1){
18            return dp[i][j];
19        }
20
21        if(s1.charAt(i)==s2.charAt(j)){
22            ways = 1 + LCS(s1,s2,i+1,j+1,dp);
23        }
24        else{
25            int f = LCS(s1,s2,i,j+1,dp);
26            int s = LCS(s1,s2,i+1,j,dp);
27
28            ways = Math.max(f,s);
29        }
30
31        return dp[i][j] = ways;
32    }
33}