// Last updated: 7/31/2025, 2:08:09 PM
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans = Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
        return ans;
        
    }
}