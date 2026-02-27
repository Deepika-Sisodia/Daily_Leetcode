// Last updated: 2/27/2026, 12:55:42 PM
1class Solution {
2    Boolean[][] dp;
3    public boolean isInterleave(String s1, String s2, String s3) {
4        dp = new Boolean[s1.length()+1][s2.length()+1];
5
6        if(s1.length()+s2.length()!=s3.length()){
7            return false;
8        }
9
10        return solve(s1,s2,s3,0,0);
11    }
12
13    public boolean solve(String s1, String s2, String s3, int i, int j){
14        if(i==s1.length() && j==s2.length()){
15            return true;
16        }
17
18        if(dp[i][j]!=null){
19            return dp[i][j];
20        }
21
22        int k = i+j;
23        boolean ans = false;
24        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
25            ans = solve(s1,s2,s3,i+1,j);
26        }
27
28        if(!ans && j<s2.length() && s2.charAt(j)==s3.charAt(k)){
29            ans = solve(s1,s2,s3,i,j+1);
30        }
31       
32
33        return dp[i][j] = ans;
34    }
35}