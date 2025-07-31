// Last updated: 7/31/2025, 2:07:55 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, idx=0;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
                idx = i;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(max!=nums[i] && max<2*nums[i]){
                return -1;
            }
        }
        return idx;
    }
}