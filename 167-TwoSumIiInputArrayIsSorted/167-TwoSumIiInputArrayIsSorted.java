// Last updated: 7/31/2025, 2:10:16 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(nums[left]+nums[right]!=target){
            if(nums[left]+nums[right]<target) left++;
            else right--;
        }
        return new int[] {left+1, right+1};
    }
}