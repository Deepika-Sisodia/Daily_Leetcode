// Last updated: 7/31/2025, 2:10:49 PM
class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int cost = 0;
        int profit = 0;
        int min = prices[0];
        for(int i=1; i<l; i++){
            cost = prices[i]-min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }

        return profit;
    }
}