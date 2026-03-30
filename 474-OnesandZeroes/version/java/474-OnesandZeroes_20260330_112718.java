// Last updated: 3/30/2026, 11:27:18 AM
1class Solution {
2    //Integer[][][] dp;
3    public int findMaxForm(String[] strs, int m, int n) {
4        //dp = new Integer[strs.length][m+1][n+1];
5        //return func(strs,n,m,0);
6        int l = strs.length;
7        int[][] dp = new int[m+1][n+1];
8
9        for(int i=0; i<l; i++){
10            int ones = 0, zeroes = 0;
11
12            for(int j=0; j<strs[i].length(); j++){
13                if(strs[i].charAt(j)=='0'){
14                    zeroes++;
15                }
16                else{
17                    ones++;
18                }
19            }
20
21            for(int j=m; j>=zeroes; j--){
22                for(int k=n; k>=ones; k--){
23                    dp[j][k] = Math.max(dp[j][k], 1 + dp[j-zeroes][k-ones]);
24                }
25            }
26        }
27
28        return dp[m][n];
29    }
30    // public int func(String[] strs, int n, int m, int idx){
31    //     if(idx==strs.length){
32    //         return 0;
33    //     }
34
35    //     if(dp[idx][m][n] != null){
36    //         return dp[idx][m][n];
37    //     }
38    //     int ones = 0;
39    //     int zeroes = 0;
40
41    //     for(int i=0; i<strs[idx].length(); i++){
42    //         if(strs[idx].charAt(i) == '0'){
43    //             zeroes++;
44    //         }
45    //         else{
46    //             ones++;
47    //         }
48    //     }
49
50    //     int not_take = func(strs,n,m,idx+1);
51    //     int take = 0;
52
53    //     if(zeroes<=m && ones<=n){
54    //         take = 1 + func(strs,n-ones,m-zeroes,idx+1);
55    //     }
56
57    //     return dp[idx][m][n] = Math.max(take,not_take);
58    // }
59}