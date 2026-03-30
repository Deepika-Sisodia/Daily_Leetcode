// Last updated: 3/30/2026, 2:45:49 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int steps = 0;
5
6        for(int i=1; i<n; i++){
7            if(nums[i]<=nums[i-1]){
8                steps += nums[i-1]-nums[i] + 1;
9                nums[i] += nums[i-1] - nums[i] + 1;
10            }
11        }
12
13        return steps;
14    }
15}