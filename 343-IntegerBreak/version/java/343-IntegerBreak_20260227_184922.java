// Last updated: 2/27/2026, 6:49:22 PM
1class Solution {
2    public int integerBreak(int n) {
3        return solve(n,0,1);
4    }
5
6    public int solve(int n, int curr, int idx){
7        if(curr==n){
8            return 1;
9        }
10
11        if(curr>n){
12            return 0;
13        }
14
15        int max = 0;
16        for(int i=idx; i<=n-curr; i++){
17            if(curr==0 && i==n) continue;
18            int next = solve(n,curr+i,i);
19            if(next!=0){
20                max = Math.max(max,i*next);
21            }
22
23        }
24
25        return max;
26    }
27}