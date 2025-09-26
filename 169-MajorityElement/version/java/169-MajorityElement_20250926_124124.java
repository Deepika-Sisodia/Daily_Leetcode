// Last updated: 9/26/2025, 12:41:24 PM
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int v = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == candidate){
                v++;
            }
            else{
                v--;

                if(v==0){
                    candidate = nums[i];
                    v=1;
                }
            }
        }

        return candidate;
    }
}