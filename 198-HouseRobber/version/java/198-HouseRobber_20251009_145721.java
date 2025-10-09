// Last updated: 10/9/2025, 2:57:21 PM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return robb(nums,dp,0);
    }

    public int robb(int[] arr, int[] dp ,int idx){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        int rob = arr[idx]+robb(arr,dp,idx+2);
        int not_rob = robb(arr,dp,idx+1);

        return dp[idx] = Math.max(rob,not_rob);
    }
}