// Last updated: 3/16/2026, 3:22:39 PM
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        int n = nums.length;
4
5        int[] dp = new int[n];
6        int[] cnt = new int[n];
7
8        Arrays.fill(dp,1);
9        Arrays.fill(cnt,1);
10
11        int maxi = 1;
12
13        for(int i=1; i<n; i++){
14            for(int j=0; j<i; j++){
15                if(nums[i]>nums[j] && dp[i]<dp[j]+1){
16                    dp[i] = dp[j]+1;
17                    cnt[i] = cnt[j];
18                }
19                else if(nums[i]>nums[j] && dp[i]==dp[j]+1){
20                    cnt[i] += cnt[j];
21                }
22            }
23
24            maxi = Math.max(maxi,dp[i]);
25        }
26
27        int ans = 0;
28        for(int i=0; i<n; i++){
29            if(maxi==dp[i]) ans += cnt[i];
30        }
31
32        return ans;
33    }
34}