// Last updated: 10/6/2025, 1:38:06 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]!='.'){
                    if(!isItValid(board,board[i][j],i,j)){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean isItValid(char[][] board, char target, int row, int col){
        // for column
        int c = col;
        int r = row;
        for(int i=0; i<r; i++){
            if(board[i][c]==target){
                return false;
            }
        }

        for(int i=r+1; i<board.length; i++){
            if(board[i][c]==target){
                return false;
            }
        }

        // for row;
        c = col;
        r = row;
        for(int i=0; i<c; i++){
            if(board[r][i]==target){
                return false;
            }
        }

        for(int i=c+1; i<board.length; i++){
            if(board[r][i]==target){
                return false;
            }
        }

        // for matrix
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i=startrow; i<startrow+3; i++){
            for(int j=startcol; j<startcol+3; j++){
                if((i!=row || j!=col) && board[i][j]==target){
                    return false;
                }
            }
        }

        return true;
    }
}