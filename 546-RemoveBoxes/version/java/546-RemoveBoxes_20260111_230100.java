// Last updated: 1/11/2026, 11:01:00 PM
1class Solution {
2    public int removeBoxes(int[] boxes) {
3        int n = boxes.length;
4        int[][][] dp = new int[n][n][n];
5
6        return remove(boxes,0,n-1,0,dp);
7    }
8
9    public int remove(int[] boxes, int l, int r, int k, int[][][] dp){
10        if(l>r) return 0;
11
12        while(l+1<=r && boxes[l]==boxes[l+1]){
13            l++;
14            k++;
15        }
16
17        if(dp[l][r][k]!=0) return dp[l][r][k];
18
19
20        int res = (k+1)*(k+1) + remove(boxes,l+1,r,0,dp);
21
22        for(int m=l+1; m<=r; m++){
23            if(boxes[l]==boxes[m] && boxes[m]!=boxes[m-1]){
24                res = Math.max(res, remove(boxes,l+1,m-1,0,dp) + remove(boxes,m,r,k+1,dp));
25            }
26        }
27
28        dp[l][r][k] = res;
29
30        return res;
31    }
32}