// Last updated: 2/1/2026, 5:24:32 PM
1class Solution {
2    public int jump(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp,-1);
5        return fun(nums,0,dp);
6
7    }
8
9    public int fun(int[] arr, int idx, int[] dp){
10        if(idx>=arr.length-1){
11            return 0;
12        }
13        if(dp[idx]!=-1){
14            return dp[idx];
15        }
16        
17        int mini = Integer.MAX_VALUE;
18        for(int i=1; i<=arr[idx]; i++){
19            if(idx+i<arr.length){
20                int next = Math.min(mini, fun(arr,idx+i,dp));
21                if(next!=Integer.MAX_VALUE){
22                    mini = Math.min(mini,next+1);
23                }
24            }
25        }
26
27        return dp[idx] = mini;
28    }
29}