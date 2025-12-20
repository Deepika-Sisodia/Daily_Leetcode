// Last updated: 12/20/2025, 11:40:25 AM
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int n) {
3        n = n % 14;
4        if (n == 0) n = 14;
5
6        for(int i=0; i<n; i++){
7            int[] ans = new int[cells.length];
8            ans[0] = ans[cells.length-1] = 0;
9
10            for(int j=1; j<cells.length-1; j++){
11                if(cells[j-1]==cells[j+1]){
12                    ans[j] = 1;
13                }
14                else{
15                    ans[j] = 0;
16                }
17            }
18
19            cells = ans;
20        }
21
22        return cells;
23    }
24}