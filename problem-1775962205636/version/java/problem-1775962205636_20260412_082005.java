// Last updated: 4/12/2026, 8:20:05 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        
5        int[] res = new int[n];
6        
7        for(int i=0; i<n; i++){
8            int deg = 0;
9            for(int j=0; j<n; j++){
10                if(matrix[i][j] == 1){
11                    deg++;
12                }
13            }
14            res[i] = deg;
15        }
16
17        return res;
18    }
19}