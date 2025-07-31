// Last updated: 7/31/2025, 2:11:13 PM
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
        
    }
}