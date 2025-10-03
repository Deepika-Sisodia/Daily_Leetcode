// Last updated: 10/3/2025, 10:49:15 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                c++;
            }
            else{
                max = Math.max(c,max);
                c = 0;
            }
        }

        return Math.max(max,c);
    }
}