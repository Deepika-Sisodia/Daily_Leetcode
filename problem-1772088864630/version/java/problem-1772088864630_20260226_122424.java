// Last updated: 2/26/2026, 12:24:24 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        int n = edges.length;
4        long[] score = new long[n];
5        for(int i=0; i<n; i++){
6            score[edges[i]] += i;
7        }
8
9        long max = -1;
10        int res = 0;
11        for(int i=0; i<n; i++){
12            if(max<score[i]){
13                max = score[i];
14                res = i;
15            }
16        }
17        return res;
18    }
19}