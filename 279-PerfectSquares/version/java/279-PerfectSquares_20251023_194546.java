// Last updated: 10/23/2025, 7:45:46 PM
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return find(n,dp);
    }

    public int find(int n, int[] dp){
        if(n==0){
            return 0;
            
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            minCount = Math.min(minCount, 1 + find(n - i * i,dp));
        }

        dp[n] = minCount;  // store result
        return minCount;
    }
}