// Last updated: 3/22/2026, 10:07:04 PM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int max = 0;
7
8        for(int i=0; i<m; i++){
9            for(int j=0; j<n; j++){
10                int area = dfs(grid,i,j);
11                max = Math.max(max,area);
12            }
13        }
14        return max;
15    }
16
17    public int dfs(int[][] grid, int row, int col){
18        if(row<0 || col<0 || row>=grid.length || col >=grid[0].length || grid[row][col]==0){
19            return 0;
20        }
21
22        int steps = 0;
23
24        grid[row][col] = 0;
25        steps++;
26
27        int up = dfs(grid,row-1,col);
28        int down = dfs(grid,row+1,col);
29        int right = dfs(grid,row,col-1);
30        int left = dfs(grid,row,col+1);
31
32        return 1 + up + down + right + left;
33    }
34}