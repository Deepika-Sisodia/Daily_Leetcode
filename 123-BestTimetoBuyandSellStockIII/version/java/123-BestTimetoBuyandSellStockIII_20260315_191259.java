// Last updated: 3/15/2026, 7:12:59 PM
1class Solution {
2    Integer[][] dp;
3    public int maxProfit(int k, int[] prices) {
4        dp = new Integer[prices.length][2*k];
5
6        return func(prices,0,0,k);
7    }
8
9    public int func(int[] arr, int idx, int trans, int k){
10        if(idx==arr.length || trans==2*k){
11            return 0;
12        }
13
14        if(dp[idx][trans] != null) return dp[idx][trans];
15
16        if(trans % 2 == 0){
17            return dp[idx][trans] = Math.max(-arr[idx] + func(arr,idx+1,trans+1,k), func(arr,idx+1,trans,k));
18        }
19
20        return dp[idx][trans] = Math.max(arr[idx] + func(arr,idx+1,trans+1,k), func(arr,idx+1,trans,k));
21    }
22}