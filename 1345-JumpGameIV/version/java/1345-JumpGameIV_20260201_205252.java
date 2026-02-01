// Last updated: 2/1/2026, 8:52:52 PM
1class Solution {
2    public int minJumps(int[] arr) {
3        int n = arr.length;
4        if(n==1) return 0;
5
6        Map<Integer, List<Integer>> map = new HashMap<>();
7        for(int i=0; i<n; i++){
8            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
9        }
10
11        boolean[] visited = new boolean[n];
12        Queue<Integer> q = new LinkedList<>();
13
14        q.offer(0);
15        visited[0] = true;
16        int steps = 0;
17
18        while(!q.isEmpty()){
19            int size = q.size();
20
21            while(size-->0){
22                int idx = q.poll();
23
24                if(idx==n-1){
25                    return steps;
26                }
27
28                if(map.containsKey(arr[idx])){
29                    for(int next: map.get(arr[idx])){
30                        if(!visited[next]){
31                            q.offer(next);
32                            visited[next]=true;
33                        }
34                    }
35
36                    map.remove(arr[idx]);
37                }
38
39                if(idx-1>=0 && !visited[idx-1]){
40                    visited[idx-1] = true;
41                    q.offer(idx-1);
42                }
43
44                if(idx+1<n && !visited[idx+1]){
45                    visited[idx+1] = true;
46                    q.offer(idx+1);
47                }
48            }
49
50            steps++;
51        }
52
53        return -1;
54    }
55}