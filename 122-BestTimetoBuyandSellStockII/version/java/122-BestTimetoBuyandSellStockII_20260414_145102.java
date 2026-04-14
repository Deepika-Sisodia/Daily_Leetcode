// Last updated: 4/14/2026, 2:51:02 PM
1class Solution {
2    Long[][][] dp;
3    public long maximumProfit(int[] prices, int k) {
4        dp = new Long[prices.length][k+1][3];
5
6        return func(prices,k,0,0);
7    }
8
9    public long func(int[] prices, int k, int idx, int type){
10        if (idx == prices.length) {
11            return (type == 0) ? 0 : (long) -1e15;
12        }
13
14        if (k == 0) {
15            return (type == 0) ? 0 : (long) -1e15;
16        }
17        if(dp[idx][k][type] != null){
18            return dp[idx][k][type];
19        }
20        long profit = 0;
21        if(type == 0){
22            profit = Math.max(func(prices,k,idx+1,0), Math.max(-prices[idx] + func(prices,k,idx+1,1), prices[idx] + func(prices,k,idx+1,2)));
23        }
24        else if(type == 1){
25            profit = Math.max(func(prices,k,idx+1,1), prices[idx] + func(prices,k-1,idx+1,0));
26        }
27        else{
28            profit = Math.max(func(prices,k,idx+1,2), -prices[idx] + func(prices,k-1,idx+1,0));
29        }
30
31        return dp[idx][k][type] = profit;
32    }
33}