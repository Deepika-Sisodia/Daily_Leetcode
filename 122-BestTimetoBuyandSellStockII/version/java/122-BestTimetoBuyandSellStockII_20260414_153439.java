// Last updated: 4/14/2026, 3:34:39 PM
1class Solution {
2    Integer[][] dp;
3    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
4        dp = new Integer[piles.size()][k+1];
5        return solve(piles,0,k);
6    }
7    public int solve(List<List<Integer>> arr, int i, int k){
8        if(i>=arr.size()){
9            return 0;
10        }
11
12        if(dp[i][k] != null){
13            return dp[i][k];
14        }
15
16        int not_taken = solve(arr,i+1,k);
17        int taken = 0, sum = 0;
18
19        for(int j=0; j<Math.min(k,arr.get(i).size()); j++){
20            sum += arr.get(i).get(j);
21            int money = sum + solve(arr,i+1,k-(j+1));
22            taken = Math.max(taken, money);
23        }
24
25        return dp[i][k] = Math.max(not_taken,taken);
26    }
27}