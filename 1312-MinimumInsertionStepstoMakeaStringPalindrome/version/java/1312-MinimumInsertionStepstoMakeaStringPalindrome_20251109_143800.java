// Last updated: 11/9/2025, 2:38:00 PM
class Solution {
    public int minInsertions(String s) {
        Integer[][] dp = new Integer[s.length()][s.length()];
        return insert(s,0,s.length()-1,dp);

    }

    public int insert(String s, int i, int j, Integer[][] dp){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(s.charAt(i)!=s.charAt(j)){
            int a = 1 + insert(s,i+1,j,dp);
            int b = 1 + insert(s,i,j-1,dp);
            dp[i][j] = Math.min(a,b);
        }

        else{
            dp[i][j] = insert(s,i+1,j-1,dp);
        }

        return dp[i][j];
    }
}