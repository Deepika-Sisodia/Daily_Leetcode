// Last updated: 10/13/2025, 8:56:19 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int start = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]-start>k){
                count++;
                start = nums[i];
            }
        }
        return count;
    }
}