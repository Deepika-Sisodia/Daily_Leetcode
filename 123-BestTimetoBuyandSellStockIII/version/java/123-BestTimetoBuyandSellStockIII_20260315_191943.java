// Last updated: 3/15/2026, 7:19:43 PM
1class Solution {
2    // Integer[][] dp;
3    public int maxProfit(int k, int[] prices) {
4        // dp = new Integer[prices.length][2*k];
5
6        // return func(prices,0,0,k);
7
8        int n = prices.length;
9
10        int[][] dp = new int[n+1][2*k+1];
11
12        for(int i=n-1; i>=0; i--){
13            for(int j=2*k-1; j>=0; j--){
14                if(j%2==0){
15                    dp[i][j] = Math.max(-prices[i]+dp[i+1][j+1],dp[i+1][j]);
16                }
17                else{
18                    dp[i][j] = Math.max(prices[i]+dp[i+1][j+1],dp[i+1][j]);
19                }
20            }
21        }
22
23        return dp[0][0];
24    }
25
26    // public int func(int[] arr, int idx, int trans, int k){
27    //     if(idx==arr.length || trans==2*k){
28    //         return 0;
29    //     }
30
31    //     if(dp[idx][trans] != null) return dp[idx][trans];
32
33    //     if(trans % 2 == 0){
34    //         return dp[idx][trans] = Math.max(-arr[idx] + func(arr,idx+1,trans+1,k), func(arr,idx+1,trans,k));
35    //     }
36
37    //     return dp[idx][trans] = Math.max(arr[idx] + func(arr,idx+1,trans+1,k), func(arr,idx+1,trans,k));
38    // }
39}