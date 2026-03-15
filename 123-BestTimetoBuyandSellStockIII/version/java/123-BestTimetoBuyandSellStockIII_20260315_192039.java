// Last updated: 3/15/2026, 7:20:39 PM
1class Solution {
2    //Integer[][][] dp;
3    public int maxProfit(int[] prices) {
4        // dp = new Integer[prices.length][2][3];
5        // return func(prices,0,1,2);
6        // int n = prices.length;
7        // int[][][] dp = new int[n+1][2][3];
8
9        // for(int idx=n-1; idx>=0; idx--){
10        //     for(int buy=0; buy<=1; buy++){
11        //         for(int cap=1; cap<=2; cap++){
12        //             int profit = 0;
13        //             if(buy==1){
14        //                 profit = Math.max(-prices[idx] + dp[idx+1][0][cap],dp[idx+1][1][cap]);
15        //             }
16        //             else{
17        //                 profit = Math.max(prices[idx] + dp[idx+1][1][cap-1],dp[idx+1][0][cap]);
18        //             }
19
20        //             dp[idx][buy][cap] = profit;
21        //         }
22        //     }
23        // }
24
25        // return dp[0][1][2];
26
27        int n = prices.length;
28
29        int[][] dp = new int[n+1][2*2+1];
30
31        for(int i=n-1; i>=0; i--){
32            for(int j=2*2-1; j>=0; j--){
33                if(j%2==0){
34                    dp[i][j] = Math.max(-prices[i]+dp[i+1][j+1],dp[i+1][j]);
35                }
36                else{
37                    dp[i][j] = Math.max(prices[i]+dp[i+1][j+1],dp[i+1][j]);
38                }
39            }
40        }
41
42        return dp[0][0];
43    }
44
45    // public int func(int[] arr, int idx, int buy, int cap){
46    //     if(cap==0) return 0;
47    //     if(idx>=arr.length) return 0;
48
49    //     if(dp[idx][buy][cap] != null) return dp[idx][buy][cap];
50
51    //     int profit = 0;
52
53    //     if(buy==1){
54    //        profit = Math.max(-arr[idx] + func(arr,idx+1,0,cap), func(arr,idx+1,1,cap)); 
55    //     }
56    //     else{
57    //         profit = Math.max(arr[idx] + func(arr,idx+1,1,cap-1), func(arr,idx+1,0,cap));
58    //     }
59
60    //     return dp[idx][buy][cap] = profit;
61    // }
62}