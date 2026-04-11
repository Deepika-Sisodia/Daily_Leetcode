// Last updated: 4/11/2026, 6:09:46 PM
1class Solution {
2    public int numTilings(int n) {
3        int mod = 1_000_000_007;
4        if(n<3) return n;
5
6        int[] dp = new int[n+1];
7        dp[1] = 1;
8        dp[2] = 2;
9        dp[3] = 5;
10        for(int i=4; i<=n; i++){
11            dp[i] = (2*dp[i-1] % mod + dp[i-3] % mod) % mod;
12        }
13
14        return dp[n];
15    }
16}