// Last updated: 7/31/2025, 2:05:49 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max_diff = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-1; i++){
            int diff = Math.abs(nums[i+1]-nums[i]);
            max_diff = Math.max(diff,max_diff);
        }
        return Math.max(max_diff,Math.abs(nums[nums.length-1]-nums[0]));
    }
}