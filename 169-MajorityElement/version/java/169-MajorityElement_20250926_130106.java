// Last updated: 9/26/2025, 1:01:06 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        l[0] = 1;
        for(int i=1; i<n; i++){
            l[i] = nums[i-1]*l[i-1];
        }

        int[] r = new int[n];
        r[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            r[i] = nums[i+1]*r[i+1];
        }

        int [] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = l[i]*r[i];
        } 

        return ans;
    }
}