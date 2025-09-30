// Last updated: 9/30/2025, 12:56:18 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        int profit = -1;
        int sell = 0;
        for(int i=1; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else{
                sell = prices[i];
                profit = sell - buy;
            }

            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}