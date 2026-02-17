// Last updated: 2/17/2026, 7:14:23 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        List<List<Integer>> adj = new ArrayList<>();
4
5        for(int i=0; i<=n; i++){
6            adj.add(new ArrayList<>());
7        }
8
9        for(int[] i: dislikes){
10            int u = i[0];
11            int v = i[1];
12
13            adj.get(u).add(v);
14            adj.get(v).add(u);
15        }
16
17        int[] color = new int[n+1];
18        for(int i=1; i<=n; i++){
19            if(color[i]!=0) continue;
20
21            Queue<Integer> q = new LinkedList<>();
22            q.offer(i);
23            color[i] = 1;
24
25            while(!q.isEmpty()){
26                int curr = q.poll();
27
28                for(int nbr: adj.get(curr)){
29                    if(color[nbr]==0){
30                        color[nbr] = -color[curr];
31                        q.offer(nbr);
32                    }
33                    else if(color[nbr]==color[curr]){
34                        return false;
35                    }
36                }
37            }
38        }
39
40        return true;
41    }
42}