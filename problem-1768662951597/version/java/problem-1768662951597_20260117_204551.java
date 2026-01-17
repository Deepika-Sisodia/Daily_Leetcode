// Last updated: 1/17/2026, 8:45:51 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        List<List<int[]>> adj = new ArrayList<>();
4        for(int i=0; i<n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int[] e: edges){
9            adj.get(e[0]).add(new int[] {e[1],e[2]});
10            adj.get(e[1]).add(new int[] {e[0],e[2]});
11        }
12
13        int[] dis = new int[n];
14        Arrays.fill(dis,Integer.MAX_VALUE);
15        dis[0] = 0;
16
17        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
18        pq.add(new int[] {0,0});
19
20        while(!pq.isEmpty()){
21            int[] curr = pq.remove();
22            int time = curr[0];
23            int node = curr[1];
24
25            if(time>dis[node]) continue;
26
27            if(time>=disappear[node]) continue;
28
29            for(int[] nbrs : adj.get(node)){
30                int nextNode = nbrs[0];
31                int weight = nbrs[1];
32                int newTime = weight+time;
33
34                if(newTime<dis[nextNode] && newTime<disappear[nextNode]){
35                    dis[nextNode] = newTime;
36                    pq.add(new int[] {newTime,nextNode});
37                }
38            }
39        }
40
41        for(int i=0; i<n; i++){
42            if(dis[i]==Integer.MAX_VALUE) dis[i]=-1;
43        }
44
45        return dis;
46    }
47}