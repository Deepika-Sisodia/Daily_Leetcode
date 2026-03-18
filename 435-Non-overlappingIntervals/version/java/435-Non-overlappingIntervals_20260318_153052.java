// Last updated: 3/18/2026, 3:30:52 PM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int n = intervals.length;
4        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
5
6        int c = 0;
7        int prev = intervals[0][1];
8        for(int i=1; i<intervals.length; i++){
9            if(intervals[i][0]<prev){
10                c++;
11            }
12            else{
13                prev = intervals[i][1];
14            }
15        }
16        return c;
17    }
18}