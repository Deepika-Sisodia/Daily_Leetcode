// Last updated: 12/30/2025, 10:08:00 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6
7        for(int i=0; i<n; i++){
8            if(!visited[i]){
9                dfs(isConnected,i,visited);
10                provinces++;
11            }
12        }
13        return provinces;
14    }
15
16    public void dfs(int[][] isConnected, int idx, boolean[] visited){
17        visited[idx] = true;
18
19        for(int i=0; i<isConnected.length; i++){
20            if(!visited[i] && isConnected[idx][i]==1){
21                dfs(isConnected,i,visited);
22            }
23        }
24    }
25}