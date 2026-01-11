// Last updated: 1/11/2026, 3:46:38 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5        Boolean[][] dp = new Boolean[m][n];
6
7        return matching(s,p,m-1,n-1,dp); 
8    }
9
10    public boolean matching(String s, String p, int i, int j, Boolean[][] dp){
11        if(i<0 && j<0) return true;
12
13        if(i>=0 && j<0) return false;
14
15        if(i<0 && j>=0){
16            for(int ii=0; ii<=j; ii++){
17                if(p.charAt(ii)!='*'){
18                    return false;
19                }
20            }
21
22            return true;
23        }
24
25        if(dp[i][j]!=null){
26            return dp[i][j];
27        }
28
29        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
30            return dp[i][j] = matching(s,p,i-1,j-1,dp);
31        }
32        if(p.charAt(j)=='*'){
33            return dp[i][j] = matching(s,p,i-1,j,dp) || matching(s,p,i,j-1,dp);
34        }
35
36        return dp[i][j] = false;
37    }
38}