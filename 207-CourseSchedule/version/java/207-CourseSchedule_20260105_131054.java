// Last updated: 1/5/2026, 1:10:54 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            adj.add(new ArrayList<>());
6        }
7        for(int i=0; i<numCourses; i++){
8            for(int[] arr: prerequisites){
9                int u = arr[0];
10                int v = arr[1];
11                adj.get(u).add(v);
12            }
13        }
14
15        Queue<Integer> q = new LinkedList<>();
16        int[] indegree = new int[numCourses];
17        int courses = 0;
18        
19        for(int u=0; u<numCourses; u++){
20            for(int v: adj.get(u)){
21                indegree[v]++;
22            }
23        }
24
25        for(int i=0; i<numCourses; i++){
26            if(indegree[i]==0){
27                q.add(i);
28                courses++;
29            }
30        }
31
32        while(!q.isEmpty()){
33            int t = q.remove();
34
35            for(int i:adj.get(t)){
36                indegree[i]--;
37                if(indegree[i]==0){
38                    q.add(i);
39                    courses++;
40                }
41            }
42        }
43
44        if(courses==numCourses) return true;
45
46        return false;
47    }
48}