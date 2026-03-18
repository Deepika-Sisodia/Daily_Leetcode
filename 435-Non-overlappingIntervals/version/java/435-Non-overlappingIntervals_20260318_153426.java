// Last updated: 3/18/2026, 3:34:26 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
4
5        int curr = intervals[0][1];
6        int ans = 0;
7        for(int i=1; i<intervals.length; i++){
8            if(curr>intervals[i][0]){
9                curr = Math.min(curr,intervals[i][1]);
10                ans++;
11            }
12
13            else{
14                curr = intervals[i][1];
15            }
16        }
17
18        return ans;
19    }
20}