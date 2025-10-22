// Last updated: 10/22/2025, 2:34:21 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return subsequence(s,0,n-1,dp);
        
    }

    public int subsequence(String s, int i,int j,int[][] dp){
        if(i>j){
            return 0;
        }

        if(i==j){
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            dp[i][j] = 2 + subsequence(s,i+1,j-1,dp);
        }

        else{
            dp[i][j] = Math.max(subsequence(s,i+1,j,dp),subsequence(s,i,j-1,dp));
        }

        return dp[i][j];
    }

}