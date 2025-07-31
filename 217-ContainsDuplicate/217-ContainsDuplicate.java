// Last updated: 7/31/2025, 2:09:41 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
            
        }
        return false;
        
        
    }
}