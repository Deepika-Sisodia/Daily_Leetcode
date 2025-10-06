// Last updated: 10/6/2025, 6:51:10 PM
class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n,dp);
    }

    public int fibo(int n, int[] dp){
        if(n==0 || n==1){
            return n; 
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int f1 = fibo(n-1,dp);
        int f2 = fibo(n-2,dp);
        return dp[n] = f1+f2;
    }
}