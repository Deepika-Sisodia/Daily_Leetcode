// Last updated: 3/31/2026, 11:34:21 AM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] arr = new int[26];
4
5        for(int i=0; i<tasks.length; i++){
6            arr[tasks[i]-'A']++;
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
10
11        for(int i: arr){
12            if(i>0) pq.offer(i);
13        }
14
15        int time = 0;
16        while(!pq.isEmpty()){
17            List<Integer> temp = new ArrayList<>();
18            int cycle = n+1;
19            int k = 0;
20            while(!pq.isEmpty() && k<cycle){
21                int curr = pq.poll();
22                curr--;
23
24                if(curr>0){
25                    temp.add(curr);
26                }
27
28                k++;
29            }
30
31            for(int i: temp){
32                pq.add(i);
33            }
34
35            if(pq.size()>0){
36                time += cycle;
37            }
38            else{
39                time += k;
40            }
41        }
42
43        return time;
44    }
45}