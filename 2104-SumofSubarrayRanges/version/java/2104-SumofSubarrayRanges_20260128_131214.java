// Last updated: 1/28/2026, 1:12:14 PM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        int n = nums.length;
4        long sum = 0;
5
6        for(int i=0; i<n; i++){
7            int min = Integer.MAX_VALUE;
8            int max = Integer.MIN_VALUE;
9            for(int j=i; j<n; j++){
10                min = Math.min(min,nums[j]);
11                max = Math.max(max,nums[j]);
12
13                sum = (sum + (max-min));
14            }
15        }
16        return sum;
17    }
18}