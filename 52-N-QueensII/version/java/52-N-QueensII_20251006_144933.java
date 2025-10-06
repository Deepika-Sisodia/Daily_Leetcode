// Last updated: 10/6/2025, 2:49:33 PM
class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        int c = 0;
        return queensPlaced(board, n, 0);
    }


    public int queensPlaced(boolean[][] board, int tq, int row){
        if(tq==0){
            return 1; 
        }
        int count = 0;
        for(int col=0; col<board.length; col++){
            if(canPlace(board,row,col)){
                board[row][col] = true;
                count += queensPlaced(board,tq-1,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public boolean canPlace(boolean[][] board, int row, int col){
        // for top
        for(int i=row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }

        // top left
        int r = row;
        int c = col;

        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // top right
        r = row;
        c = col;

        while(r>=0 && c<board.length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}