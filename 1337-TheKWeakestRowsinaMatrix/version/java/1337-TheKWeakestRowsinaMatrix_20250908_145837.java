// Last updated: 9/8/2025, 2:58:37 PM
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][2];
        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j]==1){
                    c++;
                }
                else{
                    break;
                }
            }
            ans[i][0] = c;
            ans[i][1] = i;
        }

        Arrays.sort(ans, (a,b)-> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = ans[i][1];
        }
        return result;
    }
}