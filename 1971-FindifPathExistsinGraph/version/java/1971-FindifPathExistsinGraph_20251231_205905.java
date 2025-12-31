// Last updated: 12/31/2025, 8:59:05 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        HashMap<Integer,List<Integer>> map = new HashMap<>();
4        // HashSet<Integer> visited = new HashSet<>();
5        for(int i=0; i<n; i++){
6            map.put(i,new ArrayList<>());
7        }
8
9        for(int i=0; i<edges.length;i++){
10            int u = edges[i][0];
11            int v = edges[i][1];
12            map.get(u).add(v);
13            map.get(v).add(u);
14        }
15
16        boolean[] visited = new boolean[n];
17        Queue<Integer> q = new LinkedList<>();
18        
19        q.offer(source);
20        visited[source] = true;
21        while(!q.isEmpty()){
22            int node = q.poll();
23            if(node==destination){
24                return true;
25            }
26        
27            for(int nbrs: map.get(node)){
28                if(!visited[nbrs]){
29                    visited[nbrs] = true;
30                    q.offer(nbrs);
31                }
32            }
33        }
34
35        return false;
36
37        // return hasPath(source,destination,map,visited);
38    }
39    
40    // public boolean hasPath(int src, int des, HashMap<Integer,List<Integer>> map, HashSet<Integer> visited){
41    //     if(src==des){
42    //         return true;
43    //     }
44
45    //     visited.add(src);
46    //     for(int nbrs: map.get(src)){
47    //         if(!visited.contains(nbrs)){
48    //             boolean ans = hasPath(nbrs,des,map,visited);
49    //             if(ans){
50    //                 return ans;
51    //             }
52    //         }
53    //     }
54
55    //     return false;
56    // }
57}