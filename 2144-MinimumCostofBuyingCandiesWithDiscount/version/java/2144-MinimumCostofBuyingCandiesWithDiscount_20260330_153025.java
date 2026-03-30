// Last updated: 3/30/2026, 3:30:25 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int n = cost.length;
4        Arrays.sort(cost);
5
6        int ans = 0;
7        int count = 0;
8        for(int i=n-1; i>=0; i--){
9            count++;
10            if(count%3==0) continue;
11            ans += cost[i];
12        }
13
14        return ans;
15    }
16}