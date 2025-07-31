// Last updated: 7/31/2025, 2:09:12 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int dupl=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                dupl=nums[i];

            }
            
        }
        return dupl;
        
    }
}