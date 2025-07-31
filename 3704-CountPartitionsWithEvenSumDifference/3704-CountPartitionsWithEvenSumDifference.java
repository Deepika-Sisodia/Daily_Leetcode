// Last updated: 7/31/2025, 2:06:00 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0; i<nums.length; i++){
            total+=nums[i];
        }

        int left = 0;
        int right = 0;
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            left+=nums[i];
            right = total-left;
            if((left-right)%2==0){
                count++;
            }

        }
        return count;

        
    }
}