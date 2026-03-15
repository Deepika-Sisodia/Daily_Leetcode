// Last updated: 3/15/2026, 6:42:39 PM
1class Solution {
2    Integer[][][] dp;
3    public int maxProfit(int[] prices) {
4        dp = new Integer[prices.length][2][3];
5        return func(prices,0,1,2);
6    }
7
8    public int func(int[] arr, int idx, int buy, int cap){
9        if(cap==0) return 0;
10        if(idx>=arr.length) return 0;
11
12        if(dp[idx][buy][cap] != null) return dp[idx][buy][cap];
13
14        int profit = 0;
15
16        if(buy==1){
17           profit = Math.max(-arr[idx] + func(arr,idx+1,0,cap), func(arr,idx+1,1,cap)); 
18        }
19        else{
20            profit = Math.max(arr[idx] + func(arr,idx+1,1,cap-1), func(arr,idx+1,0,cap));
21        }
22
23        return dp[idx][buy][cap] = profit;
24    }
25}