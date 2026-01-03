// Last updated: 1/3/2026, 8:18:23 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image[sr][sc]==color) return image;
4
5        fill(image,sr,sc,image[sr][sc],color);
6        
7        return image;
8    }
9    public void fill(int[][] grid, int r, int c, int color, int target_color){
10        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=color){
11            return;
12        }
13        grid[r][c] = target_color;
14        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
15        for(int[] d: dir){
16            fill(grid,r+d[0],c+d[1],color, target_color);
17        }
18    }
19}