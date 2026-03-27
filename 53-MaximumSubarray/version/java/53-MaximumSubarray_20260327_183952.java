// Last updated: 3/27/2026, 6:39:52 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int min = Integer.MAX_VALUE;
5        int l = 0, r = 0;
6        int sum  = 0;
7        while(r<n){
8            sum +=nums[r];
9
10            while(target <= sum){
11                min = Math.min(min,r-l+1);
12                sum -= nums[l];
13                l++;
14            }
15            r++;
16
17        }
18
19        return (min == Integer.MAX_VALUE) ? 0 : min;
20    }
21}