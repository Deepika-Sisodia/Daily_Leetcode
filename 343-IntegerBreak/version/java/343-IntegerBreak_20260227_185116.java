// Last updated: 2/27/2026, 6:51:16 PM
1class Solution {
2    Integer[][] dp;
3    public int integerBreak(int n) {
4        dp = new Integer[n+1][n+1];
5        return solve(n,0,1);
6    }
7
8    public int solve(int n, int curr, int idx){
9        if(curr==n){
10            return 1;
11        }
12
13        if(curr>n){
14            return 0;
15        }
16
17        if(dp[curr][idx]!=null){
18            return dp[curr][idx];
19        }
20
21        int max = 0;
22        for(int i=idx; i<=n-curr; i++){
23            if(curr==0 && i==n) continue;
24            int next = solve(n,curr+i,i);
25            if(next!=0){
26                max = Math.max(max,i*next);
27            }
28
29        }
30
31        return dp[curr][idx] = max;
32    }
33}