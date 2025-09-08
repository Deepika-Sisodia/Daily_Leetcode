// Last updated: 9/8/2025, 10:38:57 AM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] ans = new int[n*n];
        int m = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                ans[m++] = matrix[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}