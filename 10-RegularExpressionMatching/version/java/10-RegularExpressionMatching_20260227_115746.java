// Last updated: 2/27/2026, 11:57:46 AM
1class Solution {
2    Boolean[][] dp;
3    public boolean isMatch(String s, String p) {
4        dp = new Boolean[s.length()+1][p.length()+1];
5        return solve(s,p,0,0);
6    }
7
8    public boolean solve(String s, String p, int i, int j){
9        if(dp[i][j]!=null){
10            return dp[i][j];
11        }
12
13        if(p.length()==j){
14            return dp[i][j] = s.length()==i;
15        }
16
17        boolean matched = false;
18
19        if((s.length() > i) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.')){
20            matched = true;
21        }
22
23        if(p.length()>j+1 && p.charAt(j+1)=='*'){
24            boolean not_take = solve(s,p,i,j+2);
25            boolean take = matched && solve(s,p,i+1,j);
26
27            return dp[i][j] = not_take || take;
28        }
29
30        return dp[i][j] = matched && solve(s,p,i+1,j+1);
31
32    }
33}