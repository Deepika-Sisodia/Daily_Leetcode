// Last updated: 7/31/2025, 2:07:20 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, maxlen = 0, zeros = 0;
        while(r<n){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }

            if(zeros<=k){
                int len = r-l+1;
                maxlen = Math.max(len,maxlen);
            }
            
            r++;
        }
        return maxlen;
    }
}