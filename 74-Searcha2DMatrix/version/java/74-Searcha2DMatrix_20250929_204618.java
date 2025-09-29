// Last updated: 9/29/2025, 8:46:18 PM
class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    islands++;
                    check(grid,i,j);
                }
            }
        }

        return islands;
    }

    public static void check(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }

        grid[i][j] = '0';

        check(grid,i+1,j);
        check(grid,i-1,j);
        check(grid,i,j+1);
        check(grid,i,j-1);
    }
}