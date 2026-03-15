// Last updated: 3/15/2026, 7:36:39 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4
5        int[][] dp = new int[n+2][2];
6
7        for(int i=n-1; i>=0; i--){
8            for(int buy=0; buy<=1; buy++){
9                if(buy==1){
10                    dp[i][buy] = Math.max(-prices[i]+dp[i+1][0], dp[i+1][1]);
11                }
12                else{
13                    dp[i][buy] = Math.max(prices[i]+dp[i+2][1], dp[i+1][0]);
14                }
15            }
16        }
17
18        return dp[0][1];
19    }
20}