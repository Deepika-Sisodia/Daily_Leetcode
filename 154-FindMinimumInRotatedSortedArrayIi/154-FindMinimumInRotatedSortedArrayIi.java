// Last updated: 7/31/2025, 2:10:24 PM
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int ans=nums[0];
        int i=1;
        while(i<nums.length){
            min=Math.min(min,nums[i]);
            ans=Math.min(min,ans);
            i++;
        }
        return ans;

        
    }
}