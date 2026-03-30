// Last updated: 3/30/2026, 2:57:56 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3        int n = colors.length;
4        int max = 0;
5
6        for(int i=0; i<n; i++){
7            int curr = colors[i];
8            for(int j=i+1; j<n; j++){
9                if(curr != colors[j]){
10                    max = Math.max(max, j-i);
11                }
12            }
13        }
14
15        return max;
16    }
17}