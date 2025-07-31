// Last updated: 7/31/2025, 2:08:14 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length-1; i+=2){
            sum+=nums[i];
        }
        return sum;
        
    }
}