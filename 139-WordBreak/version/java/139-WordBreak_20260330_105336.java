// Last updated: 3/30/2026, 10:53:36 AM
1class Solution {
2    Boolean[] dp;
3    public boolean wordBreak(String s, List<String> wordDict) {
4        int n = s.length();
5        dp = new Boolean[n+1];
6        return func(s,wordDict,0);
7    }
8
9    public boolean func(String s, List<String> list, int idx){
10        if(idx == s.length()){
11            return true;
12        }
13        if(dp[idx] != null){
14            return dp[idx];
15        }
16
17        for(int i=idx; i<s.length(); i++){
18            String part = s.substring(idx,i+1);
19
20            if(list.contains(part) && func(s,list,i+1)){
21                return dp[idx] = true;
22            }
23        }
24
25        return dp[idx] = false;
26    }
27}