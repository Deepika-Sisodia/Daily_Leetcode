// Last updated: 12/31/2025, 8:49:18 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        HashMap<Integer,List<Integer>> map = new HashMap<>();
4        HashSet<Integer> visited = new HashSet<>();
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
16        return hasPath(source,destination,map,visited);
17    }
18    
19    public boolean hasPath(int src, int des, HashMap<Integer,List<Integer>> map, HashSet<Integer> visited){
20        if(src==des){
21            return true;
22        }
23
24        visited.add(src);
25        for(int nbrs: map.get(src)){
26            if(!visited.contains(nbrs)){
27                boolean ans = hasPath(nbrs,des,map,visited);
28                if(ans){
29                    return ans;
30                }
31            }
32        }
33
34        return false;
35    }
36}