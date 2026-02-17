// Last updated: 2/17/2026, 6:00:49 PM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] indegree = new int[n+1];
4
5        for(int i=0; i<trust.length; i++){
6            indegree[trust[i][1]]++;
7            indegree[trust[i][0]]--;
8        }
9
10        for(int i=1; i<=n; i++){
11            if(indegree[i]==n-1){
12                return i;
13            }
14        }
15        return -1;
16    }
17}