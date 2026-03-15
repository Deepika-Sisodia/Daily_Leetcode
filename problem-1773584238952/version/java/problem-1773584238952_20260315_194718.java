// Last updated: 3/15/2026, 7:47:18 PM
1class Solution {
2    public int maxProfit(int[] prices, int fee) {
3        int n = prices.length;
4
5        int[][] dp = new int[n+1][2];
6
7        for(int i=n-1; i>=0; i--){
8            dp[i][0] = Math.max(prices[i]-fee + dp[i+1][1], dp[i+1][0]);
9            dp[i][1] = Math.max(-prices[i] + dp[i+1][0], dp[i+1][1]);
10        }
11
12        return dp[0][1];
13    }
14}