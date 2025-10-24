// Last updated: 10/24/2025, 5:42:43 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return dis(word1,word2,0,0,dp);
    }

    public int dis(String a, String b, int i, int j, int[][] dp){
        if(i==a.length()){
            return b.length()-j;
        }
        if(j==b.length()){
            return a.length()-i;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }


        if(a.charAt(i)==b.charAt(j)){
            dp[i][j] = dis(a,b,i+1,j+1,dp);
        }

        else{
            int ins = dis(a,b,i,j+1,dp);
            int del = dis(a,b,i+1,j,dp);
            int rep = dis(a,b,i+1,j+1,dp);

            dp[i][j] = 1 + Math.min(ins,Math.min(del,rep));
        }

        return dp[i][j];
    }
}