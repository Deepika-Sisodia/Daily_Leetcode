// Last updated: 7/31/2025, 2:11:37 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(maxIdx<i){
                return false;
            }
            maxIdx = Math.max(maxIdx,nums[i]+i);
        }

        return true;
    }
}