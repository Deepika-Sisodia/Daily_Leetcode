// Last updated: 1/16/2026, 11:18:34 PM
1class Solution {
2    public int countHousePlacements(int n) {
3        long MOD = 1000000007;
4        long[] dp = new long[n+1];
5        dp[0] = 1;
6        dp[1] = 2;
7
8        for(int i=2; i<=n; i++){
9            dp[i] = (dp[i-1]+dp[i-2]) % MOD;
10        }
11
12        long ways = dp[n];
13        
14        return (int) ((ways*ways) % MOD);
15    }
16}