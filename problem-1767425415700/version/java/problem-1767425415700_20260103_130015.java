// Last updated: 1/3/2026, 1:00:15 PM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int[][] res = new int[mat.length][mat[0].length];
4        for(int[] i: res){
5            Arrays.fill(i,-1);
6        }
7        Queue<int[]> q = new LinkedList<>();
8        for(int i=0; i<mat.length; i++){
9            for(int j=0; j<mat[0].length; j++){
10                if(mat[i][j]==0){
11                    res[i][j]=0;
12                    q.offer(new int[] {i,j});
13                }
14            }
15        }
16        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
17        while(!q.isEmpty()){
18            int[] curr = q.poll();
19            int r = curr[0];
20            int c = curr[1];
21            for(int[] d: dir){
22                int newR = r+d[0];
23                int newC = c+d[1];
24                if(newR>=0 && newC>=0 && newR<mat.length && newC<mat[0].length && res[newR][newC]==-1){
25                    res[newR][newC] = res[r][c]+1;
26                    q.offer(new int[] {newR,newC});
27                }
28            }
29        }
30        return res;
31    }
32}