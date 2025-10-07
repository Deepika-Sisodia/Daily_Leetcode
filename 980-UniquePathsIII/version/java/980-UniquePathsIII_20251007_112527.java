// Last updated: 10/7/2025, 11:25:27 AM
class Solution {
    int totalcells;
    int paths = 0;
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int startx = 0, starty = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    startx=i;
                    starty=j;
                }
                if(grid[i][j]!=-1){
                    totalcells++;
                }
            }
        }
        dfs(grid,startx,starty,1);
        return paths;
    }
    public void dfs(int[][] grid, int i, int j, int count){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==-1){
            return;
        }
        if(grid[i][j]==2){
            if(totalcells==count){
                paths++;
            }
            return;
        }

        int temp = grid[i][j];
        grid[i][j]=-1;
        dfs(grid,i+1,j,count+1);
        dfs(grid,i-1,j,count+1);
        dfs(grid,i,j+1,count+1);
        dfs(grid,i,j-1,count+1);

        grid[i][j]=temp;
    }
}