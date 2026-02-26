// Last updated: 2/26/2026, 11:34:06 AM
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
3        int n = numCourses;
4        boolean[][] graph = new boolean[n][n];
5        for(int[] p: prerequisites){
6            graph[p[0]][p[1]] = true;
7        }
8
9        for(int k=0; k<n; k++){
10            for(int i=0; i<n; i++){
11                for(int j=0; j<n; j++){
12                    if(graph[i][k] && graph[k][j]){
13                        graph[i][j] = true;
14                    }
15                }
16            }
17        }
18
19        List<Boolean> ans = new ArrayList<>();
20        for(int[] q: queries){
21            ans.add(graph[q[0]][q[1]]);
22        }
23
24        return ans;
25    }
26}