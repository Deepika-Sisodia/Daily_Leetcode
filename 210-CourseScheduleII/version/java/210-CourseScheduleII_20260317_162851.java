// Last updated: 3/17/2026, 4:28:51 PM
1class Solution {
2    public boolean isBipartite(int[][] graph) {
3        Queue<BipartitePair> q = new LinkedList<>();
4        HashMap<Integer, Integer> visited = new HashMap<>();
5
6        for(int key=0; key<graph.length; key++){
7            if(visited.containsKey(key)){
8                continue;
9            }
10
11            q.add(new BipartitePair(key, 0));
12            while(!q.isEmpty()){
13                BipartitePair rp = q.poll(); //remove
14                
15                if(visited.containsKey(rp.vtx)){
16                    if(visited.get(rp.vtx)!= rp.dis){
17                        return false;
18                    }
19                    continue;
20                }
21
22                visited.put(rp.vtx, rp.dis);
23
24                for(int nbrs: graph[rp.vtx]){
25                    if(!visited.containsKey(nbrs)){
26                        q.add(new BipartitePair (nbrs, rp.dis+1));
27                    }
28                }
29            }
30
31        }
32        return true;
33    }
34
35    class BipartitePair{
36        int vtx;
37        int dis;
38
39        BipartitePair(int vtx, int dis){
40            this.vtx = vtx;
41            this.dis = dis;
42        }
43    }
44}