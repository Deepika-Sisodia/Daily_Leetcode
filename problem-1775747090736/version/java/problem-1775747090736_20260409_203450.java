// Last updated: 4/9/2026, 8:34:50 PM
1class Solution {
2    Integer[][] dp;
3    public int maxSatisfaction(int[] satisfaction) {
4        int n = satisfaction.length;
5        dp = new Integer[n+1][n+1];
6
7        Arrays.sort(satisfaction);
8        return solve(satisfaction, 0 , 1);
9    }
10
11    public int solve(int[] arr, int idx, int time){
12        if(idx>=arr.length){
13            return 0;
14        }
15
16        if(dp[idx][time] != null) return dp[idx][time];
17
18        int pick = time*arr[idx] + solve(arr,idx+1,time+1);
19        int not_pick = solve(arr,idx+1,time);
20
21        return dp[idx][time] = Math.max(pick,not_pick);
22    }
23}