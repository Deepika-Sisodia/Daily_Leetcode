// Last updated: 10/8/2025, 7:15:38 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = search(board,word,0,i,j);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int idx, int cr, int cc){
        int m = board.length;
        int n = board[0].length;

        if(idx==word.length()){
            return true;
        }

        if(cr<0 || cc<0 || cr>=m || cc>=n || board[cr][cc]!=word.charAt(idx)){
            return false;
        }

        board[cr][cc] = '*';
        boolean up = search(board,word,idx+1,cr-1,cc);
        boolean down = search(board,word,idx+1,cr+1,cc);
        boolean left = search(board,word,idx+1,cr,cc-1);
        boolean right = search(board,word,idx+1,cr,cc+1);

        board[cr][cc] = word.charAt(idx);

        return (up || down || left || right);
    }
}