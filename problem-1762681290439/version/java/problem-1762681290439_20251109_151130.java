// Last updated: 11/9/2025, 3:11:30 PM
class Solution {
    public int minDistance(String word1, String word2) {
        Integer[][] dp = new Integer[word1.length()][word2.length()];
        return deletion(word1,word2,0,0,dp);
    }

    public int deletion(String s1, String s2, int i, int j,Integer[][] dp){
        if(i>=s1.length()){
            return s2.length()-j;
        }

        if(j>=s2.length()){
            return s1.length()-i;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j] = deletion(s1,s2,i+1,j+1,dp);
        }
        else{
            int a = 1 + deletion(s1,s2,i+1,j,dp);
            int b = 1 + deletion(s1,s2,i,j+1,dp);
            dp[i][j] = Math.min(a,b);
        }

        return dp[i][j];
    }
}