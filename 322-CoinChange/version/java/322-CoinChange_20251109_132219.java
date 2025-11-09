// Last updated: 11/9/2025, 1:22:19 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        // Arrays.sort(coins);
        // int ans = change(coins,amount,coins.length-1);
        // if(ans!=Integer.MAX_VALUE){
        //     return ans;
        // }
        // return -1;
        
        int max = amount+1;
        int[] dp = new int[max];
        Arrays.fill(dp,max);
        dp[0] = 0;

        for(int coin : coins){
            for(int i=coin; i<max; i++){
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];

    // public static int change(int[] coins, int amount, int idx){
    //     if(amount==0){
    //         return 0;
    //     }

    //     if(amount<0 || idx<0){
    //         return Integer.MAX_VALUE;
    //     }

    //     int inc = Integer.MAX_VALUE;
    //     int sub = change(coins, amount-coins[idx], idx);
    //     if(sub!=Integer.MAX_VALUE){
    //         inc = 1 + sub;
    //     }
    //     int exc = change(coins, amount, idx-1);

    //     return Math.min(inc,exc);
    }
}