// Last updated: 7/31/2025, 2:08:29 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr =new int[m*n];
        int row=0;
        int col=0;
        int idx=0;
        boolean up = true;
        while(idx<m*n){
            arr[idx++]=mat[row][col];
            if(up){ //moving up
                if(col==n-1){
                    row++;
                    up=false;
                }
                else if(row==0){
                    col++;
                    up=false;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{ // moving down
                if(row==m-1){
                    col++;
                    up=true;
                }
                else if(col==0){
                    row++;
                    up=true;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }
}