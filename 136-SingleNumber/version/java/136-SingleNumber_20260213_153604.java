// Last updated: 2/13/2026, 3:36:04 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int XOR = 0;
4
5        for(int i=0; i<nums.length; i++){
6            XOR = XOR^nums[i];
7        }
8
9        return XOR;
10    }
11}