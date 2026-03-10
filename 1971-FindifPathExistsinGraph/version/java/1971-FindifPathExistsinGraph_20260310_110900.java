// Last updated: 3/10/2026, 11:09:00 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image[sr][sc]==color){
4            return image;
5        }
6
7        dfs(image,sr,sc,image[sr][sc],color);
8        return image;
9    }
10
11    public void dfs(int[][] grid, int r, int c, int curr, int target){
12        if(r>=grid.length || r<0 || c>=grid[0].length || c<0 || grid[r][c] != curr){
13            return;
14        }
15
16        grid[r][c] = target;
17
18        dfs(grid,r+1,c,curr,target);
19        dfs(grid,r-1,c,curr,target);
20        dfs(grid,r,c+1,curr,target);
21        dfs(grid,r,c-1,curr,target);
22    }
23}