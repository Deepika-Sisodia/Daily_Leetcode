// Last updated: 7/31/2025, 2:10:13 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}