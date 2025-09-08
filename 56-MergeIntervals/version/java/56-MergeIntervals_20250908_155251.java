// Last updated: 9/8/2025, 3:52:51 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] curr = intervals[0];
        ans.add(curr);

        for(int i[] : intervals){
            if(i[0]<=curr[1]){
                curr[1] = Math.max(i[1],curr[1]);
            }
            else{
                curr = i;
                ans.add(curr);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

}