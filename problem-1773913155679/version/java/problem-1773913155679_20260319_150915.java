// Last updated: 3/19/2026, 3:09:15 PM
1class Solution {
2    public int[][] highestPeak(int[][] isWater) {
3        int m = isWater.length;
4        int n = isWater[0].length;
5
6        int[][] dp = new int[m][n];
7        for(int[] i : dp){
8            Arrays.fill(i,-1);
9        }
10
11        Queue<int[]> q = new LinkedList<>();
12
13        for(int i=0; i<m; i++){
14            for(int j=0; j<n; j++){
15                if(isWater[i][j] == 1){
16                    dp[i][j] = 0;
17                    q.add(new int[] {i,j});
18                }
19            }
20        }
21
22        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
23
24        while(!q.isEmpty()){
25            int[] curr = q.poll();
26            int row = curr[0];
27            int col = curr[1];
28
29            for(int i=0; i<dir.length; i++){
30                int r = row + dir[i][0];
31                int c = col + dir[i][1];
32
33                if(r>=0 && r<m && c>=0 && c<n && dp[r][c] == -1){
34                    dp[r][c] = dp[row][col] + 1;
35                    q.add(new int[]{r,c});
36                }
37            }
38        }
39
40        return dp;
41    }
42}