// Last updated: 7/31/2025, 2:08:54 PM
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