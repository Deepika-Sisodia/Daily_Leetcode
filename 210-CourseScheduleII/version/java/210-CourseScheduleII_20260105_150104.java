// Last updated: 1/5/2026, 3:01:04 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            adj.add(new ArrayList<>());
6        }
7        for(int[] arr: prerequisites){
8            int u = arr[0];
9            int v = arr[1];
10            adj.get(v).add(u);
11        }
12        int[] res = new int[numCourses];
13        Queue<Integer> q = new LinkedList<>();
14        int[] indegree = new int[numCourses];
15        int courses = 0;
16        for(int u=0; u<numCourses; u++){
17            for(int v: adj.get(u)){
18                indegree[v]++;
19            }
20        }
21
22        for(int i=0; i<indegree.length; i++){
23            if(indegree[i]==0){
24                q.add(i);
25                courses++;
26            }
27        }
28        int k=0;
29        while(!q.isEmpty()){
30            int t = q.remove();
31            res[k] = t;
32            k++;
33            for(int i: adj.get(t)){
34                indegree[i]--;
35                if(indegree[i]==0){
36                    q.add(i);
37                    courses++;
38                }
39            }
40        }
41        if(courses!=numCourses) return new int[] {};
42        return res;   
43    }
44}