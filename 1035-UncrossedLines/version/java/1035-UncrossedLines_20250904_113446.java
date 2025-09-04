// Last updated: 9/4/2025, 11:34:46 AM
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }

        return func(coins,amount,0,dp);
    }

    public static int func(int[] coin, int amount, int i,int[][] dp){
        if(amount==0){
            return 1;
        }

        if(i==coin.length){
            return 0;
        }

        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }

        int inc = 0, exc = 0;
        if(amount>=coin[i]){
            inc = func(coin,amount-coin[i],i,dp);
        }
        exc = func(coin,amount, i+1,dp);
        return dp[amount][i] = inc + exc;
    }
}