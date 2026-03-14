// Last updated: 3/14/2026, 12:13:32 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int c = 0;
6        for(int i=0; i<m; i++){
7            for(int j=0; j<n; j++){
8                if(grid[i][j]=='1'){
9                    c++;
10                    dfs(grid, i, j);
11                }
12            }
13        }
14
15        return c;
16    }
17
18    public void dfs(char[][] grid, int i, int j){
19        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0'){
20            return;
21        }
22
23        grid[i][j] = '0';
24
25        dfs(grid,i+1,j);
26        dfs(grid,i-1,j);
27        dfs(grid,i,j+1);
28        dfs(grid,i,j-1);
29    }
30}