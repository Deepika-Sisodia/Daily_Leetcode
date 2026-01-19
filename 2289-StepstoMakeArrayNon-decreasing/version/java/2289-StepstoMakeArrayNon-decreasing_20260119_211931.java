// Last updated: 1/19/2026, 9:19:31 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Stack<Integer> st = new Stack<>();
6        int ans = 0;
7
8        for(int i=n-1; i>=0; i--){
9            int maxSteps = 0;
10            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
11                maxSteps = Math.max(maxSteps+1, dp[st.peek()]);
12                st.pop();
13            }
14            dp[i] = maxSteps;
15            ans = Math.max(ans,dp[i]);
16            st.push(i);
17        }
18
19        return ans;
20    }
21}