// Last updated: 10/3/2025, 11:40:35 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, maxLen = 0, zeroes = 0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }

            while(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }

            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            r++;
        }

        return maxLen;
    }
}