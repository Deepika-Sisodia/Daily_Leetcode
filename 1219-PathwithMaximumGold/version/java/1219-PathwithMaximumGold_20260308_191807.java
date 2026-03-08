// Last updated: 3/8/2026, 7:18:07 PM
1class Solution {
2    public int getMaximumGold(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int max = 0;
6        for(int i=0; i<m; i++){
7            for(int j=0; j<n; j++){
8                if(grid[i][j]!=0){
9                    int val = func(grid,i,j,m,n);
10                    max = Math.max(max,val);
11                }
12            }
13        }
14
15        return max;
16    }
17
18    public int func(int[][] grid, int i, int j, int m, int n){
19        if(i>=m || i<0 || j>=n || j<0 || grid[i][j]==0){
20            return 0;
21        }
22
23        int val = grid[i][j];
24        grid[i][j] = 0;
25
26        int up = val + func(grid,i-1,j,m,n);
27        int down = val + func(grid,i+1,j,m,n);
28        int left = val + func(grid,i,j-1,m,n);
29        int right = val + func(grid,i,j+1,m,n);
30
31        grid[i][j] = val;
32
33        return Math.max(up, Math.max(down, Math.max(left,right)));
34    }
35}