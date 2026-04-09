// Last updated: 4/9/2026, 8:02:52 PM
1class Solution {
2    Integer[] dp;
3    public int mincostTickets(int[] days, int[] costs) {
4        dp = new Integer[days.length+1];
5        return solve(days,costs,0);
6    }
7    public int solve(int[] arr, int[] cost, int idx){
8        if(idx>=arr.length){
9            return 0;
10        }
11
12        if(dp[idx] != null) return dp[idx];
13
14        int day1 = cost[0] + solve(arr,cost,idx+1);
15
16        int i = idx;
17        while(i<arr.length && arr[i] < arr[idx] + 7){
18            i++;
19        }
20
21        int day7 = cost[1] + solve(arr,cost,i);
22
23        i = idx;
24        while(i<arr.length && arr[i] < arr[idx] + 30){
25            i++;
26        }
27
28        int day30 = cost[2] + solve(arr,cost,i);
29
30        return dp[idx] = Math.min(day1,Math.min(day7,day30));
31    }
32}