// Last updated: 3/30/2026, 11:16:09 AM
1class Solution {
2    Integer[][][] dp;
3    public int findMaxForm(String[] strs, int m, int n) {
4        dp = new Integer[strs.length][m+1][n+1];
5        return func(strs,n,m,0);
6    }
7    public int func(String[] strs, int n, int m, int idx){
8        if(idx==strs.length){
9            return 0;
10        }
11
12        if(dp[idx][m][n] != null){
13            return dp[idx][m][n];
14        }
15        int ones = 0;
16        int zeroes = 0;
17
18        for(int i=0; i<strs[idx].length(); i++){
19            if(strs[idx].charAt(i) == '0'){
20                zeroes++;
21            }
22            else{
23                ones++;
24            }
25        }
26
27        int not_take = func(strs,n,m,idx+1);
28        int take = 0;
29
30        if(zeroes<=m && ones<=n){
31            take = 1 + func(strs,n-ones,m-zeroes,idx+1);
32        }
33
34        return dp[idx][m][n] = Math.max(take,not_take);
35    }
36}