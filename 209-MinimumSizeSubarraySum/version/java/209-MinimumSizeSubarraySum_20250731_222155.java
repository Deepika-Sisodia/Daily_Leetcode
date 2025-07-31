// Last updated: 7/31/2025, 10:21:55 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum  = 0;
        while(r<n){
            sum +=nums[r];

            while(target <= sum){
                min = Math.min(min,r-l+1);
                sum -= nums[l];
                l++;
            }
            r++;

        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}