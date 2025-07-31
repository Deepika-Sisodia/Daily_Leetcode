// Last updated: 7/31/2025, 2:06:09 PM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for(int j=1; j<nums.length-1; j++){
            int maxleft = 0;
            int maxright = 0;
            for(int i=0; i<j; i++){
                maxleft = Math.max(maxleft,nums[i]);
            }

            for(int k=j+1; k<nums.length; k++){
                maxright = Math.max(maxright,nums[k]);
            }

            max = Math.max(max,(maxleft-nums[j])*(long)maxright);
        }
        return max;
        
    }
}