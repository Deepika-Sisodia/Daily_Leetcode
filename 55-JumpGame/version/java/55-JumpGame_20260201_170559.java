// Last updated: 2/1/2026, 5:05:59 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        for(int i=0; i<n; i++){
6            if(i>max){
7                return false;
8            }
9            int curr = i+nums[i];
10            max = Math.max(max,curr);
11        }
12
13        return true;
14    }
15}