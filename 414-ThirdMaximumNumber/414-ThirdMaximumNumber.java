// Last updated: 7/31/2025, 2:08:40 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        int currentmax=nums[n-1];

        for(int i=n-2; i>=0; i--){
            if(nums[i]!=currentmax){
                currentmax=nums[i];
                count++;
                if(count==3){
                    return currentmax;
                }
            }
        }
        return nums[n-1];

        
    }
}