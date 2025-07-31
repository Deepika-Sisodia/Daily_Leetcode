// Last updated: 7/31/2025, 2:09:23 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] left = new int[n];

        int[] ans = new int[n];
        left[0]=1;
        for(int i=1; i<left.length; i++){
            left[i]=left[i-1]*nums[i-1];

        }
        int[] right = new int[n];
        right[n-1]=1;
        for(int i=right.length-2; i>=0;i--){
            right[i]=right[i+1]*nums[i+1];

        }

        for(int i=0; i<n; i++){
            ans[i]=(left[i]*right[i]);
        }
        return ans;
        
    }
}