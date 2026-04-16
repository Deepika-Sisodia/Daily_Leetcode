// Last updated: 4/16/2026, 2:51:19 PM
1class Solution {
2    Integer[] dp;
3    int mod = 1_000_000_007;
4    public int numberOfArrays(String s, int k) {
5        dp = new Integer[s.length()+1];
6        return solve(s,k,0);
7    }
8
9    public int solve(String s, int k, int start){
10        if(start>=s.length()){
11            return 1;
12        }
13        if(s.charAt(start)=='0'){
14            return 0;
15        }
16
17        if(dp[start] != null){
18            return dp[start];
19        }
20
21        int ways = 0;
22        long val = 0;
23        for(int end = start; end<s.length(); end++){
24            val = val*10 + (s.charAt(end)-'0');
25            if(val>k) break;
26
27            ways = (ways + solve(s, k, end+1)) % mod;
28        }
29
30        return dp[start] = ways;
31    }
32}