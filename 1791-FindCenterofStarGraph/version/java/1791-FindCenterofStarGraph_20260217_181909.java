// Last updated: 2/17/2026, 6:19:09 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]){
4            return edges[0][0];
5        }
6
7        return edges[0][1];
8    }
9}