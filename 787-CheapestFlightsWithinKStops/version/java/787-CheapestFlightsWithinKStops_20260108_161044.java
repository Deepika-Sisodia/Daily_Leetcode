// Last updated: 1/8/2026, 4:10:44 PM
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        HashMap<Integer, HashMap<Integer, Integer>> adj = new HashMap<>();
4        for(int i=0; i<n; i++){
5            adj.put(i, new HashMap<>());
6        }
7
8        for(int[] i : flights){
9            int u = i[0];
10            int v = i[1];
11            int w = i[2];
12            adj.get(u).put(v,w);
13        }
14
15        Queue<Val> q = new LinkedList<>();
16        q.add(new Val(0,src,0));
17
18        int[] dis = new int[n];
19        Arrays.fill(dis,Integer.MAX_VALUE);
20        dis[src] = 0;
21
22        while(!q.isEmpty()){
23            Val curr = q.remove();
24            int stops = curr.s;
25            int node = curr.n;
26            int cost = curr.c;
27
28            if(stops>k) continue;
29
30            for(int i: adj.get(node).keySet()){
31                int newC = adj.get(node).get(i);
32
33                if(cost+newC < dis[i] && stops<=k){
34                    dis[i] = cost+newC;
35                    q.add(new Val(stops+1,i,cost+newC));
36                }
37            }
38        }
39
40        if(dis[dst]==Integer.MAX_VALUE) return -1;
41        return dis[dst];
42    }
43
44    class Val{
45        int s;
46        int n;
47        int c;
48        Val(int s, int n, int c){
49            this.s = s;
50            this.n = n;
51            this.c = c;
52        }
53    }
54}