// Last updated: 4/2/2026, 4:18:15 PM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] dp = new int[n+1];
4        int i2 = 1;
5        int i3 = 1;
6        int i5 = 1;
7        dp[1] = 1;
8        for(int i=2; i<=n; i++){
9            int num2 = dp[i2]*2;
10            int num3 = dp[i3]*3;
11            int num5 = dp[i5]*5;
12
13            int ans = Math.min(num2, Math.min(num3,num5));
14
15            dp[i] = ans;
16
17            if(ans == num2){
18                i2++;
19            }
20            if(ans == num3){
21                i3++;
22            }
23            if(ans == num5){
24                i5++;
25            }
26        }
27        return dp[n];
28    }
29}