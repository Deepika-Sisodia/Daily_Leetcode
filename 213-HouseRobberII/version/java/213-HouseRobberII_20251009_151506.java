// Last updated: 10/9/2025, 3:15:06 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int r1 = robb(nums,0,n-2,dp);
        Arrays.fill(dp,-1);
        int r2 = robb(nums,1,n-1,dp);

        return Math.max(r1,r2);
    }

    public int robb(int[] arr, int start, int end, int[] dp){
        if(start>end){
            return 0;
        }

        if(dp[start]!=-1){
            return dp[start];
        }

        int rob = arr[start] + robb(arr,start+2,end,dp);
        int not_rob = robb(arr,start+1,end,dp);

        return dp[start] = Math.max(rob,not_rob);
    }
}