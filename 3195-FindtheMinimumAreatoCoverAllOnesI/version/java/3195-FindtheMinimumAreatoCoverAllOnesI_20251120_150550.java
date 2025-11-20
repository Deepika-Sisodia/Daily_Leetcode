// Last updated: 11/20/2025, 3:05:50 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int mini=Integer.MAX_VALUE;
        int minj=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int maxj=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mini=Math.min(i,mini);
                    minj=Math.min(j,minj);
                    maxi=Math.max(i,maxi);
                    maxj=Math.max(j,maxj);
                }
            }
        }
        return (maxi-mini+1)*(maxj-minj+1);
    }
}