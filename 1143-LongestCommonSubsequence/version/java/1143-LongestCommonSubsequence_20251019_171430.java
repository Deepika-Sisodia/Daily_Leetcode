// Last updated: 10/19/2025, 5:14:30 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }

    public int lcs(String s1, String s2, int i, int j, int[][] dp){
        if(s1.length()==i || s2.length()==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans = 1 + lcs(s1,s2,i+1,j+1,dp);
        }
        else{
            int f = lcs(s1,s2,i+1,j,dp);
            int s = lcs(s1,s2,i,j+1,dp);
            ans = Math.max(f,s);
        }
        return dp[i][j] = ans;
    }
}