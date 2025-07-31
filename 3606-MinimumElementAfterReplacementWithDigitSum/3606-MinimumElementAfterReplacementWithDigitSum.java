// Last updated: 7/31/2025, 2:06:06 PM
class Solution {
    public int minElement(int[] nums) {
        int min_val = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            while(nums[i]>0){
                int r = nums[i]%10;
                sum+=r;
                nums[i]=nums[i]/10;
            }
            min_val = Math.min(min_val,sum);
        }
        return min_val;
        
    }
}