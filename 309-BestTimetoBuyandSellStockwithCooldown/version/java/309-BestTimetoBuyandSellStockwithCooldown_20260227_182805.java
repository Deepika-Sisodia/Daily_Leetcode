// Last updated: 2/27/2026, 6:28:05 PM
1class Solution {
2    Integer[][] dp;
3    public int maxProfit(int[] prices) {
4        dp = new Integer[prices.length][2];
5        return solve(prices,0,1);
6    }
7    public int solve(int[] prices, int i, int canBuy){
8        if(i>=prices.length){
9            return 0;
10        }
11
12        if(dp[i][canBuy]!=null){
13            return dp[i][canBuy];
14        }
15        
16        int ans;
17
18        if(canBuy==1){
19            int buy = -prices[i] + solve(prices,i+1,0);
20            int skip = solve(prices,i+1,1);
21            ans = Math.max(buy,skip);
22        }
23
24        else{
25            int sell = prices[i] + solve(prices,i+2,1);
26            int skip = solve(prices,i+1,0);
27
28            ans = Math.max(sell,skip);
29        }
30
31        return dp[i][canBuy] = ans;
32    }
33}