// Last updated: 10/7/2025, 10:59:15 AM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        int diff = find(nums,0,nums.length-1,dp);
        return diff>=0;
    }

    public int find(int[] arr, int i, int j, int[][] dp){
        if(i==j){
            return arr[i];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int pickstart = arr[i] - find(arr,i+1,j,dp);
        int pickend = arr[j] - find(arr,i,j-1,dp);

        return dp[i][j] = Math.max(pickstart,pickend);
    }
}