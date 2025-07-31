// Last updated: 7/31/2025, 2:05:51 PM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=n-1; i>=0; i--){
            sortDiagonal(grid,i,0,false);
        }
        for(int j=1; j<n; j++){
            sortDiagonal(grid,0,j,true);
        }
        return grid;
    }

    public static void sortDiagonal(int[][] grid, int row, int col, boolean ascending){
        int n = grid.length;
        int size = Math.min(n-row,n-col);
        int[] diagonal = new int[size];

        for(int k=0; k<size; k++){
            diagonal[k]=grid[row+k][col+k];
        }

        Arrays.sort(diagonal);
        if(!ascending){
            for(int left=0,right=size-1; left<right; left++,right--){
                int temp=diagonal[left];
                diagonal[left]=diagonal[right];
                diagonal[right]=temp;
                
            }
        }
        for(int k=0; k<size; k++){
            grid[row+k][col+k]=diagonal[k];
        }
    }
}