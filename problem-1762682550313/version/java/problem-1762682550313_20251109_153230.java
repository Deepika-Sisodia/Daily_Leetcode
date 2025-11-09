// Last updated: 11/9/2025, 3:32:30 PM
class Solution {
    public int minDistance(String word1, String word2) {
        // Integer[][] dp = new Integer[word1.length()][word2.length()];
        // return deletion(word1,word2,0,0,dp);
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        dp[0][0] = 0;
        for(int i=1; i<dp.length; i++){
            dp[i][0] = i;
        }

        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = i;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    dp[i][j] = 1 + Math.min(a,b);
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    // public int deletion(String s1, String s2, int i, int j,Integer[][] dp){
    //     if(i>=s1.length()){
    //         return s2.length()-j;
    //     }

    //     if(j>=s2.length()){
    //         return s1.length()-i;
    //     }

    //     if(dp[i][j]!=null){
    //         return dp[i][j];
    //     }

    //     if(s1.charAt(i)==s2.charAt(j)){
    //         dp[i][j] = deletion(s1,s2,i+1,j+1,dp);
    //     }
    //     else{
    //         int a = 1 + deletion(s1,s2,i+1,j,dp);
    //         int b = 1 + deletion(s1,s2,i,j+1,dp);
    //         dp[i][j] = Math.min(a,b);
    //     }

    //     return dp[i][j];
    // }
}