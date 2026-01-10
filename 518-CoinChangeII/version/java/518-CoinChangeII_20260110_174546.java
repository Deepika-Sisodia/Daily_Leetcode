// Last updated: 1/10/2026, 5:45:46 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3        int n = coins.length;
4        int[][] dp = new int[n+1][amount+1];
5
6        for(int[] i: dp){
7            Arrays.fill(i,-1);
8        }
9
10        return coin(amount,coins,0,dp);
11    }
12
13    public int coin(int amount, int[] coins, int idx, int[][] dp){
14        if(amount==0){
15            return 1;
16        }
17        if(idx==coins.length){
18            return 0;
19        }
20
21        if(dp[idx][amount]!=-1){
22            return dp[idx][amount];
23        }
24        
25        int inc = 0;
26
27        if(amount>=coins[idx]){
28            inc = coin(amount-coins[idx], coins, idx, dp);
29        }
30
31        int exc = coin(amount, coins, idx+1,dp);
32
33        return dp[idx][amount] = inc+exc;
34    }
35}