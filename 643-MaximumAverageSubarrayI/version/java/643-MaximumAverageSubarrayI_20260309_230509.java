// Last updated: 3/9/2026, 11:05:09 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double ans = -1e9;
4        for(int i=0; i<=nums.length-k; i++){
5            int avg = 0;
6            int sum = 0;
7            for(int j=i; j<i+k; j++){
8                sum += nums[j];
9            }
10            ans = Math.max((double) sum/k, ans);
11        }
12
13        return ans;
14    }
15}