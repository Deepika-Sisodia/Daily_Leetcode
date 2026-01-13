// Last updated: 1/13/2026, 2:48:07 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int max_profit = 0;
5        int buy = prices[0];
6        for(int i=1; i<n; i++){
7            if(buy>prices[i]){
8                buy = prices[i];
9            }
10            else{
11                int sell = prices[i];
12                int profit = sell-buy;
13
14                max_profit = Math.max(max_profit,profit);
15            }
16        }
17
18        return max_profit;
19    }
20}