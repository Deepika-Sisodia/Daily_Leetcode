// Last updated: 12/21/2025, 4:04:39 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        // Integer[][] dp = new Integer[word1.length()][word2.length()];
4        // return deletion(word1,word2,0,0,dp);
5        int[][] dp = new int[word1.length()+1][word2.length()+1];
6        dp[0][0] = 0;
7        for(int i=1; i<dp.length; i++){
8            dp[i][0] = i;
9        }
10
11        for(int i=1; i<dp[0].length; i++){
12            dp[0][i] = i;
13        }
14
15        for(int i=1; i<dp.length; i++){
16            for(int j=1; j<dp[0].length; j++){
17                if(word1.charAt(i-1)==word2.charAt(j-1)){
18                    dp[i][j] = dp[i-1][j-1];
19                }
20                else{
21                    int a = dp[i-1][j];
22                    int b = dp[i][j-1];
23                    dp[i][j] = 1 + Math.min(a,b);
24                }
25            }
26        }
27
28        return dp[dp.length-1][dp[0].length-1];
29    }
30
31    // public int deletion(String s1, String s2, int i, int j,Integer[][] dp){
32    //     if(i>=s1.length()){
33    //         return s2.length()-j;
34    //     }
35
36    //     if(j>=s2.length()){
37    //         return s1.length()-i;
38    //     }
39
40    //     if(dp[i][j]!=null){
41    //         return dp[i][j];
42    //     }
43
44    //     if(s1.charAt(i)==s2.charAt(j)){
45    //         dp[i][j] = deletion(s1,s2,i+1,j+1,dp);
46    //     }
47    //     else{
48    //         int a = 1 + deletion(s1,s2,i+1,j,dp);
49    //         int b = 1 + deletion(s1,s2,i,j+1,dp);
50    //         dp[i][j] = Math.min(a,b);
51    //     }
52
53    //     return dp[i][j];
54    // }
55}