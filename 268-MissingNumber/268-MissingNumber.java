// Last updated: 7/31/2025, 2:09:18 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                c=i;
                break;
            }
            else{
                c=nums.length;
            }
        }
        return c;
        
    }
}