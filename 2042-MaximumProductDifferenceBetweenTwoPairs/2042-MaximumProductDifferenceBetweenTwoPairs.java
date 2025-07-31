// Last updated: 7/31/2025, 2:06:31 PM
class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}