// Last updated: 3/15/2026, 6:51:12 PM
1class Solution {
2    //Integer[][][] dp;
3    public int maxProfit(int[] prices) {
4        // dp = new Integer[prices.length][2][3];
5        // return func(prices,0,1,2);
6        int n = prices.length;
7        int[][][] dp = new int[n+1][2][3];
8
9        for(int idx=n-1; idx>=0; idx--){
10            for(int buy=0; buy<=1; buy++){
11                for(int cap=1; cap<=2; cap++){
12                    int profit = 0;
13                    if(buy==1){
14                        profit = Math.max(-prices[idx] + dp[idx+1][0][cap],dp[idx+1][1][cap]);
15                    }
16                    else{
17                        profit = Math.max(prices[idx] + dp[idx+1][1][cap-1],dp[idx+1][0][cap]);
18                    }
19
20                    dp[idx][buy][cap] = profit;
21                }
22            }
23        }
24
25        return dp[0][1][2];
26    }
27
28    // public int func(int[] arr, int idx, int buy, int cap){
29    //     if(cap==0) return 0;
30    //     if(idx>=arr.length) return 0;
31
32    //     if(dp[idx][buy][cap] != null) return dp[idx][buy][cap];
33
34    //     int profit = 0;
35
36    //     if(buy==1){
37    //        profit = Math.max(-arr[idx] + func(arr,idx+1,0,cap), func(arr,idx+1,1,cap)); 
38    //     }
39    //     else{
40    //         profit = Math.max(arr[idx] + func(arr,idx+1,1,cap-1), func(arr,idx+1,0,cap));
41    //     }
42
43    //     return dp[idx][buy][cap] = profit;
44    // }
45}