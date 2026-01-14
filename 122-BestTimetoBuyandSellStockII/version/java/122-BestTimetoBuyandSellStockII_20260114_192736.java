// Last updated: 1/14/2026, 7:27:36 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][] dp = new int[prices.length][2];
4        for(int[] i: dp){
5            Arrays.fill(i,-1);
6        }
7
8        return func(prices,0,1,dp);
9    }
10
11    public int func(int[] prices, int idx, int buy, int[][] dp){
12        if(idx==prices.length){
13            return 0;
14        }
15
16        if(dp[idx][buy]!=-1){
17            return dp[idx][buy];
18        }
19        
20        int profit = 0;
21
22        if(buy==1){
23            profit = Math.max(-prices[idx]+func(prices,idx+1,0,dp), func(prices,idx+1,1,dp));
24        }
25        else{
26            profit = Math.max(prices[idx]+func(prices,idx+1,1,dp),func(prices,idx+1,0,dp));
27        }
28
29        return dp[idx][buy] = profit;
30    }
31}