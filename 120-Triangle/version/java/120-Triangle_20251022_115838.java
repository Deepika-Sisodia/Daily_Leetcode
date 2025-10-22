// Last updated: 10/22/2025, 11:58:38 AM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] i : dp){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        return path(triangle,0,0,dp);
    }

    public int path(List<List<Integer>> ll, int row, int col, int[][] dp){
        if(ll.size()-1==row){
            return ll.get(row).get(col);
        }

        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }

        int down = ll.get(row).get(col) + path(ll,row+1,col,dp);
        int diagonal = ll.get(row).get(col) + path(ll,row+1,col+1,dp);

        return dp[row][col] = Math.min(down,diagonal);
    }
}