// Last updated: 2/13/2026, 4:10:27 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        for(int i=1; i<n; i+=3){
6            if(nums[i]!=nums[i-1]){
7                return nums[i-1];
8            }
9        }
10        return nums[n-1];
11    }
12}