// Last updated: 2/17/2026, 8:03:40 PM
1class Solution {
2    public long countPairs(int n, int[][] edges) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for(int i=0; i<=n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int[] i: edges){
9            int u = i[0];
10            int v = i[1];
11            adj.get(u).add(v);
12            adj.get(v).add(u);
13        }
14
15        boolean[] visited = new boolean[n];
16        long totalPairs = (long) n*(n-1)/2;
17
18        long reachablePairs = 0;
19
20        for(int i=0; i<n; i++){
21            if(!visited[i]){
22                long size = dfs(i,adj,visited);
23                reachablePairs += size*(size-1)/2;
24            }
25        }
26
27        return totalPairs - reachablePairs;
28    }
29
30    public long dfs(int node, List<List<Integer>> adj, boolean[] visited){
31        visited[node] = true;
32        long count = 1;
33
34        for(int nbr: adj.get(node)){
35            if(!visited[nbr]){
36                count += dfs(nbr,adj,visited);
37            }
38        }
39        return count;
40    }
41}