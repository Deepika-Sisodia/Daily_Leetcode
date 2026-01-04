// Last updated: 1/4/2026, 3:37:25 PM
1class Solution {
2    public int numDecodings(String s) {
3        Integer[] dp = new Integer[s.length()];
4        return decode(s,0,dp);
5    }
6    public int decode(String s, int idx, Integer[] dp){
7        if(idx==s.length()){
8            return 1;
9        }
10
11        if(s.charAt(idx)=='0'){
12            return 0;
13        }
14
15        if(dp[idx]!=null){
16            return dp[idx];
17        }
18
19        int ways = 0;
20
21        ways += decode(s,idx+1,dp);
22
23        if(idx+1<s.length()){
24            int val = Integer.parseInt(s.substring(idx,idx+2));
25            if(val>=10 && val<=26){
26                ways+=decode(s,idx+2,dp);
27            }
28        }
29
30        return dp[idx] = ways;
31    }
32}