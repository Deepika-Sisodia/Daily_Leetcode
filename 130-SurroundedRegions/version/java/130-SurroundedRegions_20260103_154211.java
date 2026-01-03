// Last updated: 1/3/2026, 3:42:11 PM
1class Solution {
2    public void solve(char[][] board) {
3        int n = board.length;
4        int m = board[0].length;
5        for(int i=0; i<n; i++){
6            if(board[i][0]=='O'){
7                dfs(board,i,0);
8            }
9            if(board[i][m-1]=='O'){
10                dfs(board,i,m-1);
11            }
12        }
13
14        for(int i=0; i<m; i++){
15            if(board[0][i]=='O'){
16                dfs(board,0,i);
17            }
18            if(board[n-1][i]=='O'){
19                dfs(board,n-1,i);
20            }
21        }
22        for(int i=0; i<n; i++){
23            for(int j=0; j<m; j++){
24                if(board[i][j]=='O'){
25                    board[i][j]='X';
26                }
27                else if(board[i][j]=='#'){
28                    board[i][j]='O';
29                }
30            }
31        }
32
33    }
34
35    public void dfs(char[][] board, int r,int c){
36        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O'){
37            return;
38        }
39
40        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
41        board[r][c] = '#';
42        for(int[] d: dir){
43            dfs(board,r+d[0],c+d[1]);
44        }
45        
46    }
47}