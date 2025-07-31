// Last updated: 7/31/2025, 2:05:58 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            int left = i-k;
            int right = i+k;
            boolean isGood = true;

            if(left>=0 && nums[i]<=nums[left]){
                isGood = false;
            }
            if(right<nums.length && nums[i]<=nums[right]){
                isGood = false;
            }

            if(isGood){
                sum+=nums[i];
            }
        }
        return sum;
    }
}