// Last updated: 1/10/2026, 5:27:55 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4        int max = amount+1;
5        int[] dp = new int[max];
6        Arrays.fill(dp,max);
7
8        dp[0] = 0;
9        for(int coin : coins){
10            for(int j=coin; j<max; j++){
11                dp[j] = Math.min(dp[j],dp[j-coin]+1);
12            }
13        }
14        
15        return dp[amount] > amount ? -1 : dp[amount];
16    }
17}