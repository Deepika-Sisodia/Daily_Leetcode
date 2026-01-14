// Last updated: 1/14/2026, 6:33:17 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int max_profit = 0;
5        int buy = prices[0];
6        for(int i=1; i<n; i++){
7            int profit = prices[i]-buy;
8            max_profit = Math.max(profit,max_profit);
9            buy = Math.min(prices[i],buy);
10        }
11
12        return max_profit;
13    }
14}