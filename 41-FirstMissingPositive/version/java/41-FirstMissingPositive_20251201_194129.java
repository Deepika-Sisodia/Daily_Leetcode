// Last updated: 12/1/2025, 7:41:29 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4        int currMax = 0;
5        int max = Integer.MIN_VALUE;
6        int currMin = 0;
7        int min = Integer.MAX_VALUE;
8
9        for(int i=0; i<nums.length; i++){
10            total += nums[i];
11
12            currMax = Math.max(nums[i], currMax+nums[i]);
13            max = Math.max(max,currMax);
14
15            currMin = Math.min(nums[i], currMin+nums[i]);
16            min = Math.min(min,currMin);
17        }
18
19        if(max<0){
20            return max;
21        }
22
23        return Math.max(max, total-min);
24    }
25}