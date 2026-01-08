// Last updated: 1/8/2026, 7:36:28 PM
1class Solution {
2    static final int MOD = 1000000007;
3    public int countPaths(int n, int[][] roads) {
4        HashMap<Integer, HashMap<Integer, Integer>> adj = new HashMap<>();
5
6        for(int i=0; i<n; i++){
7            adj.put(i, new HashMap<>());
8        }
9
10        for(int[] i: roads){
11            int u = i[0];
12            int v = i[1];
13            int w = i[2];
14            adj.get(u).put(v,w);
15            adj.get(v).put(u,w);
16        }
17
18        long[] dis = new long[n];
19        Arrays.fill(dis, Long.MAX_VALUE);
20
21        int[] ways = new int[n];
22        Arrays.fill(ways,0);
23
24        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)-> Long.compare(a.d,b.d));
25        pq.add(new Pair(0,0));
26        dis[0] = 0;
27        ways[0] = 1;
28        while(!pq.isEmpty()){
29            Pair curr = pq.remove();
30            long dist = curr.d;
31            int node = curr.n;
32
33            if(dist>dis[node]) continue;
34
35            for(int i: adj.get(node).keySet()){
36                int next = i;
37                long newdis = adj.get(node).get(i)+dist;
38
39                // first time shortest path
40                if(newdis < dis[next]){
41                    dis[next] = newdis;
42                    pq.add(new Pair(newdis, next));
43                    ways[next] = ways[node];
44                }
45                else if(newdis == dis[next]){
46                    ways[next] = (ways[next]+ways[node]) % MOD;
47                }
48            }
49            
50        }
51
52        return ways[n-1];
53    }
54
55    class Pair{
56        long d;
57        int n;
58        Pair(long d, int n){
59            this.d = d;
60            this.n = n;
61        }
62    }
63}