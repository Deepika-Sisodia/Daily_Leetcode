// Last updated: 3/17/2026, 12:50:58 PM
1class Solution {
2    Integer[][] dp;
3    public int minCost(int n, int[] cuts) {
4        Arrays.sort(cuts);
5
6        int[] arr = new int[cuts.length+2];
7        arr[0] = 0;
8        for(int i=1; i<=cuts.length; i++){
9            arr[i] = cuts[i-1];
10        }
11        arr[arr.length-1] = n;
12
13        dp = new Integer[arr.length][arr.length];
14
15        return func(arr,1,arr.length-2);
16    }
17
18    public int func(int[] cuts, int i, int j){
19        if(i>j) return 0;
20
21        if(dp[i][j] != null) return dp[i][j];
22
23        int mini = Integer.MAX_VALUE;
24
25        for(int idx=i; idx<=j; idx++){
26            int cost = cuts[j+1] - cuts[i-1] + func(cuts,i,idx-1) + func(cuts,idx+1,j);
27            mini = Math.min(cost,mini);
28        }
29
30        return dp[i][j] = mini;
31    }
32}