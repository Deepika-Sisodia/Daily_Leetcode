// Last updated: 4/2/2026, 2:57:07 PM
1class Solution {
2    Integer[][] dp;
3    public int minDifficulty(int[] jobDifficulty, int d) {
4        dp = new Integer[jobDifficulty.length][d+1];
5        int ans = solve(jobDifficulty,d,0);
6        return ans == Integer.MAX_VALUE ? -1 : ans;
7    }
8
9    public int solve(int[] arr, int d, int idx){
10        if(d==1){
11            int maxD = Integer.MIN_VALUE;
12
13            for(int i=idx; i<arr.length; i++){
14                maxD = Math.max(maxD, arr[i]);
15            }
16
17            return dp[idx][d] = maxD;
18        }
19
20        if(dp[idx][d] != null){
21            return dp[idx][d];
22        }
23
24        int maxD = Integer.MIN_VALUE;
25        int ans = Integer.MAX_VALUE;
26        for(int i=idx; i<=arr.length-d; i++){
27            maxD = Math.max(maxD,arr[i]);
28            int result = maxD + solve(arr,d-1,i+1);
29            ans = Math.min(result,ans);
30        }
31
32        return dp[idx][d] = ans;
33    }
34}