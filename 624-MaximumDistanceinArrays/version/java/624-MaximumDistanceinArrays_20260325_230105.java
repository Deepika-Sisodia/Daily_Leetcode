// Last updated: 3/25/2026, 11:01:05 PM
1class Solution {
2    public int maxDistance(List<List<Integer>> arrays) {
3        int min = arrays.get(0).get(0);
4        int max = arrays.get(0).get(arrays.get(0).size()-1);
5        int ans = 0;
6
7        for(int i=1; i<arrays.size(); i++){
8            List<Integer> curr = arrays.get(i);
9            int currMin = curr.get(0);
10            int currMax = curr.get(curr.size()-1);
11
12            ans = Math.max(ans, Math.abs(max-currMin));
13            ans = Math.max(ans, Math.abs(currMax-min));
14
15            min = Math.min(currMin,min);
16            max = Math.max(currMax,max);
17        }
18
19        return ans;
20    }
21}