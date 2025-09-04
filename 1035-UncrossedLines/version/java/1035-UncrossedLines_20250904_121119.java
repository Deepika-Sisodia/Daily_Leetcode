// Last updated: 9/4/2025, 12:11:19 PM
class Solution {
    public int change(int amount, int[] coins) {
        // int[][] dp = new int[amount+1][coins.length];
        // for(int[] i: dp){
        //     Arrays.fill(i,-1);
        // }

        // return func(coins,amount,0,dp);
        return func(coins,amount);
    }

    // public static int func(int[] coin, int amount, int i,int[][] dp){
    //     if(amount==0){
    //         return 1;
    //     }

    //     if(i==coin.length){
    //         return 0;
    //     }

    //     if(dp[amount][i]!=-1){
    //         return dp[amount][i];
    //     }

    //     int inc = 0, exc = 0;
    //     if(amount>=coin[i]){
    //         inc = func(coin,amount-coin[i],i,dp);
    //     }
    //     exc = func(coin,amount, i+1,dp);
    //     return dp[amount][i] = inc + exc;
    // }

    public static int func(int[] coin, int amount){
        int[][] dp = new int[coin.length+1][amount+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<dp.length; i++){
            for(int am = 1; am<dp[0].length; am++){
                int inc = 0, exc = 0;
                if(am>=coin[i-1]){
                    inc = dp[i][am-coin[i-1]];
                }
                exc = dp[i-1][am];
                dp[i][am] = inc + exc;
            }
        }

        return dp[dp.length-1][dp[0].length-1];

    }
}