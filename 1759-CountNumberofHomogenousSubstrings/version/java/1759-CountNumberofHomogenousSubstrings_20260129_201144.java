// Last updated: 1/29/2026, 8:11:44 PM
1class Solution {
2    public int countHomogenous(String s) {
3        int n = s.length();
4        long ans = 0;
5        long MOD = 1_000_000_007;
6        int c = 1;
7        for(int i=1; i<n; i++){
8            if(s.charAt(i-1)==s.charAt(i)){
9                c++;
10            }
11            else{
12                ans = (ans + (long) c*(c+1)/2) % MOD;
13                c=1;
14            }
15        }
16
17        ans = (ans + (long) c*(c+1)/2) % MOD;
18
19        return (int) ans;
20    }
21}