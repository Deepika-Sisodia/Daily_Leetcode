// Last updated: 1/5/2026, 4:10:57 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        List<List<Integer>> revAdj = new ArrayList<>();
5        for(int i=0; i<n; i++){
6            revAdj.add(new ArrayList<>());
7        }
8
9        int[] indegree = new int[n];
10        for(int u=0; u<n; u++){
11            for(int v: graph[u]){
12                revAdj.get(v).add(u);
13                indegree[u]++;
14            }
15        }
16
17        Queue<Integer> q = new LinkedList<>();
18        ArrayList<Integer> res = new ArrayList<>();
19
20        for(int i=0; i<n; i++){
21            if(indegree[i]==0){
22                q.add(i);
23            }
24        }
25        while(!q.isEmpty()){
26            int t = q.remove();
27            res.add(t);
28
29            for(int i: revAdj.get(t)){
30                indegree[i]--;
31                if(indegree[i]==0){
32                    q.add(i);
33                }
34            }
35        }
36        Collections.sort(res);
37        return res;
38    }
39}