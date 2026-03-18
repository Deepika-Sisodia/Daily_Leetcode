// Last updated: 3/18/2026, 3:51:02 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        int n = intervals.length;
4        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
5
6        List<int[]> ans = new ArrayList<>();
7        int[] curr = intervals[0];
8        ans.add(curr);
9
10        for(int i[] : intervals){
11            if(i[0]<=curr[1]){
12                curr[1] = Math.max(i[1],curr[1]);
13            }
14            else{
15                curr = i;
16                ans.add(curr);
17            }
18        }
19
20        return ans.toArray(new int[ans.size()][]);
21    }
22
23}