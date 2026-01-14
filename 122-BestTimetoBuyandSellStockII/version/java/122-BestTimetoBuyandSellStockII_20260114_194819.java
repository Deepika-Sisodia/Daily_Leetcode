// Last updated: 1/14/2026, 7:48:19 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int[][] dp = new int[prices.length][2];
4        // for(int[] i: dp){
5        //     Arrays.fill(i,-1);
6        // }
7
8        // return func(prices,0,1,dp);
9        dp[0][1] = 0;
10        dp[0][0] = -prices[0];
11        for(int i = 1; i < prices.length; i++){
12    dp[i][1] = Math.max(
13        dp[i-1][1],              // do nothing
14        dp[i-1][0] + prices[i]   // sell today
15    );
16
17    dp[i][0] = Math.max(
18        dp[i-1][0],              // hold
19        dp[i-1][1] - prices[i]   // buy today
20    );
21}
22
23        return dp[dp.length-1][1];
24    }
25
26    public int func(int[] prices, int idx, int buy, int[][] dp){
27        if(idx==prices.length){
28            return 0;
29        }
30
31        if(dp[idx][buy]!=-1){
32            return dp[idx][buy];
33        }
34
35        int profit = 0;
36
37        if(buy==1){
38            profit = Math.max(-prices[idx]+func(prices,idx+1,0,dp), func(prices,idx+1,1,dp));
39        }
40        else{
41            profit = Math.max(prices[idx]+func(prices,idx+1,1,dp),func(prices,idx+1,0,dp));
42        }
43
44        return dp[idx][buy] = profit;
45    }
46}