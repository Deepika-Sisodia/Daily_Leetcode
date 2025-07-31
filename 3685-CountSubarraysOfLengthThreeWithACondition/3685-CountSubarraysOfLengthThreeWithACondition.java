// Last updated: 7/31/2025, 2:06:01 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0; i<=nums.length-3; i++){
            int first = nums[i];
            int middle = nums[i+1];
            int last = nums[i+2];
            if(middle%2==0){
                if(first+last==middle/2){
                    count++;
                }
            }
        }
        return count;
    }
}