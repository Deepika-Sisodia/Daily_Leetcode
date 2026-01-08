// Last updated: 1/8/2026, 4:46:21 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        HashMap<Integer, HashMap<Integer, Integer>> adj = new HashMap<>();
4        for(int i=1; i<=n; i++){
5            adj.put(i,new HashMap<>());
6        }
7
8        for(int[] i: times){
9            int u = i[0];
10            int v = i[1];
11            int w = i[2];
12
13            adj.get(u).put(v,w);
14        }
15
16        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(a.t - b.t));
17        int[] time = new int[n+1];
18        Arrays.fill(time,Integer.MAX_VALUE);
19
20        time[k] = 0;
21        pq.add(new Pair(0,k));
22        while(!pq.isEmpty()){
23            Pair curr = pq.remove();
24            int currT = curr.t;
25            int currN = curr.s;
26
27            if (currT > time[currN]) continue;
28
29            for(int i: adj.get(currN).keySet()){
30                if(currT+adj.get(currN).get(i)<time[i]){
31                    time[i] = currT+adj.get(currN).get(i);
32                    pq.add(new Pair(currT+adj.get(currN).get(i),i));
33                }
34            }
35        }
36        int ans = 0;
37        for(int i=1; i<=n; i++){
38            if(time[i]==Integer.MAX_VALUE) return -1;
39            ans = Math.max(ans,time[i]);
40        }
41
42        return ans;
43    }
44
45    class Pair{
46        int t;
47        int s;
48        Pair(int t, int s){
49            this.t = t;
50            this.s = s;
51        }
52    }
53}