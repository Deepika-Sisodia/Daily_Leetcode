// Last updated: 10/1/2025, 10:59:16 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int total = prices[0]+prices[1];
        if(money>=total){
            return money-total;
        }
        return money;
    }
}