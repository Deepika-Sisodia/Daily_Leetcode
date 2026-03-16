// Last updated: 3/16/2026, 2:21:07 PM
1class Solution {
2    public int longestStrChain(String[] words) {
3        Arrays.sort(words, (a,b)-> a.length()-b.length());
4        int n = words.length;
5        int[] dp = new int[n];
6        Arrays.fill(dp,1);
7        int maxi = 1;
8
9        for(int i=1; i<n; i++){
10            for(int j=0; j<i; j++){
11                if(compare(words[i],words[j]) && dp[i] < 1 + dp[j]){
12                    dp[i] = 1 + dp[j];
13                }
14
15                maxi = Math.max(maxi,dp[i]);
16            }
17        }
18
19        return maxi;
20    }
21
22    public boolean compare(String s1, String s2){
23        int i=0, j=0;
24        if(s1.length() != s2.length()+1) return false;
25
26        while(i<s1.length() && j<s2.length()){
27            if(s1.charAt(i)==s2.charAt(j)){
28                i++;
29                j++;
30            }
31            else{
32                i++;
33            }
34        }
35
36        return j>=s2.length();
37    }
38}