// Last updated: 7/31/2025, 2:06:55 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=0;
        int col=grid[0].length-1;
        while(row<grid.length && col>=0){
            if(grid[row][col]<0){
                count=count+(grid.length-row);
                col--;
            }
            else{
                row++;
            }
        }
        return count;
        
    }
}