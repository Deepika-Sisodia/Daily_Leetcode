// Last updated: 1/6/2026, 1:35:19 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};
6
7        if(grid[0][0]==1 || grid[n-1][m-1]==1){
8            return -1;
9        }
10        int level = 0;
11        Queue<int[]> q = new LinkedList<>();
12        q.add(new int[]{0,0});
13        grid[0][0] = 1;
14
15        while(!q.isEmpty()){
16            int len = q.size();
17            level++;
18            while(len-->0){
19                int[] curr = q.remove();
20                
21                int x = curr[0];
22                int y = curr[1];
23
24                if(x==n-1 && y==m-1){
25                    return level;
26                }
27
28                for(int[] d:dir){
29                    int newX = x+d[0];
30                    int newY = y+d[1];
31                    if(newX>=0 && newY>=0 && newX<n && newY<m && grid[newX][newY]==0){
32                        q.add(new int[] {newX,newY});
33                        grid[newX][newY] = 1;
34                    }
35                }
36            }
37        }
38
39        return -1;
40        
41    }
42} 