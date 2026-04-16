// Last updated: 4/16/2026, 11:29:22 AM
1class Solution {
2    Integer[][][] dp;
3    int mod = 1_000_000_007;
4    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
5        dp = new Integer[profit.length][minProfit+1][n+1];
6        return solve(n,profit,group,minProfit,0,0,0);
7    }
8
9    public int solve(int n, int[] profit, int[] group, int minProfit, int idx, int val, int people){
10        val = Math.min(val, minProfit);
11        if(idx==profit.length){
12            if(val>=minProfit){
13                return 1;
14            }
15            else{
16                return 0;
17            }
18        }
19
20        if(dp[idx][val][people] != null) return dp[idx][val][people];
21        
22        int not_take = solve(n,profit,group,minProfit,idx+1,val,people);
23        int take = 0;
24        if(people + group[idx] <= n){
25            take = solve(n,profit,group,minProfit,idx+1,val+profit[idx],people+group[idx]);
26        }
27
28        return dp[idx][val][people] = (not_take + take) % mod;
29    }
30}