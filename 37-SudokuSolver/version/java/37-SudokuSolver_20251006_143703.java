// Last updated: 10/6/2025, 2:37:03 PM
class Solution {
    public void solveSudoku(char[][] board) {
        canSolve(board,0,0);
    }

    public boolean canSolve(char[][] board, int row, int col){
        if(col==9){
            row = row+1;
            col = 0;
        }

        if(row==9){
            return true;
        }


        if(board[row][col]!='.'){
            return canSolve(board,row,col+1);
        }

        else{
            for(int val=1; val<=9; val++){
                char target = (char) (val+'0');
                if(isItValid(board,target,row,col)){
                    board[row][col] = target;
                    if(canSolve(board,row,col+1)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public boolean isItValid(char[][] board, int target, int row, int col){
        // for column
        for(int i=0; i<9; i++){
            if(board[i][col]==target){
                return false;
            }
            if(board[row][i]==target){
                return false;
            }
        }

        // for matrix
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i=startrow; i<startrow+3; i++){
            for(int j=startcol; j<startcol+3; j++){
                if(board[i][j]==target){
                    return false;
                }
            }
        }

        return true;
    }
}