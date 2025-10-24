// Last updated: 10/24/2025, 6:04:02 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        // for(int[] i : dp){
        //     Arrays.fill(i,-1);
        // }
        // return dis(word1,word2,0,0,dp);

        for(int i=0; i<dp.length; i++){
            dp[i][0] = i;
        }

        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = i;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int ins = dp[i][j-1];
                    int del = dp[i-1][j];
                    int rep = dp[i-1][j-1];

                    dp[i][j] = 1 + Math.min(ins,Math.min(del,rep));
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    // public int dis(String a, String b, int i, int j, int[][] dp){
    //     if(i==a.length()){
    //         return b.length()-j;
    //     }
    //     if(j==b.length()){
    //         return a.length()-i;
    //     }

    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }


    //     if(a.charAt(i)==b.charAt(j)){
    //         dp[i][j] = dis(a,b,i+1,j+1,dp);
    //     }

    //     else{
    //         int ins = dis(a,b,i,j+1,dp);
    //         int del = dis(a,b,i+1,j,dp);
    //         int rep = dis(a,b,i+1,j+1,dp);

    //         dp[i][j] = 1 + Math.min(ins,Math.min(del,rep));
    //     }

    //     return dp[i][j];
    // }
}