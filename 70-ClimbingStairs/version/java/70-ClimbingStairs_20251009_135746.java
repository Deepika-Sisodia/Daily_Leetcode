// Last updated: 10/9/2025, 1:57:46 PM
class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }
}