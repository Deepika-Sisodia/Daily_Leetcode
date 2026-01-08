// Last updated: 1/8/2026, 2:37:26 PM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        int n = heights.length;
4        int m = heights[0].length;
5
6        int[][] dist = new int[n][m];
7        for(int[] i: dist){
8            Arrays.fill(i,Integer.MAX_VALUE);
9        }
10        int[] dr = {1,-1,0,0};
11        int[] dc = {0,0,1,-1};
12        PriorityQueue<Val> pq = new PriorityQueue<Val>((a,b)-> (a.diff-b.diff));
13        dist[0][0] = 0;
14        pq.add(new Val(0,0,0));
15
16        while(!pq.isEmpty()){
17            Val curr = pq.remove();
18            int d = curr.diff;
19            int r = curr.row;
20            int c = curr.col;
21
22            if(r==n-1 && c==m-1) return d;
23
24            for(int i=0; i<4; i++){
25                int newr = r+dr[i];
26                int newc = c+dc[i];
27
28                if(newr>=0 && newc>=0 && newr<n && newc<m){
29                    int effort = Math.max(Math.abs(heights[r][c]-heights[newr][newc]),d);
30                    if(effort<dist[newr][newc]){
31                        dist[newr][newc] = effort;
32                        pq.add(new Val(effort,newr,newc));
33                    }
34                }
35            }
36        }
37        return 0;
38    }
39
40    class Val{
41        int diff;
42        int row;
43        int col;
44        Val(int diff, int row, int col){
45            this.diff = diff;
46            this.row = row;
47            this.col = col;
48        }
49
50    }
51}