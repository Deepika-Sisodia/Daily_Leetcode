// Last updated: 1/3/2026, 4:10:01 PM
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        for(int i=0; i<n; i++){
6            if(grid[i][0]==1){
7                dfs(grid,i,0);
8            }
9            if(grid[i][m-1]==1){
10                dfs(grid,i,m-1);
11            }
12        }
13
14        for(int i=0; i<m; i++){
15            if(grid[0][i]==1){
16                dfs(grid,0,i);
17            }
18            if(grid[n-1][i]==1){
19                dfs(grid,n-1,i);
20            }
21        }
22
23        int ans = 0;
24        for(int i=0; i<n; i++){
25            for(int j=0; j<m; j++){
26                if(grid[i][j]==1){
27                    ans++;
28                }
29            }
30        }
31
32        return ans;
33    }
34
35    public void dfs(int[][] grid, int r, int c){
36        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1){
37            return;
38        }
39        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
40
41        grid[r][c] = 0;
42        for(int[] d : dir){
43            dfs(grid,r+d[0],c+d[1]);
44        }
45    }
46}