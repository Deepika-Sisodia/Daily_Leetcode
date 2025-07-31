// Last updated: 7/31/2025, 2:06:35 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}