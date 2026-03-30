// Last updated: 3/30/2026, 2:41:35 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int steps = 0;
5
6        for(int i=1; i<n; i++){
7            while(nums[i]<=nums[i-1]){
8                steps++;
9                nums[i]++;
10            }
11        }
12
13        return steps;
14    }
15}