class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int vis[][] = new int[board.length][board[0].length];
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O' && vis[0][j] == 0)
                dfs(board, vis, 0, j);
            if (board[m - 1][j] == 'O' && vis[m - 1][j] == 0)
                dfs(board, vis, m - 1, j);
        }
        for (int j = 0; j < m; j++) {
            if (board[j][0] == 'O' && vis[j][0] == 0)
                dfs(board, vis, j, 0);
            if (board[j][n - 1] == 'O' && vis[j][n - 1] == 0)
                dfs(board, vis, j, n - 1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0)
                    board[i][j] = 'X';
            }
        }
    }

    static void dfs(char[][] board, int[][] vis, int row, int col) {
        vis[row][col] = 1;
        int m = board.length;
        int n = board[0].length;
        int drow[] = { -1, 0, 1, 0 };
        int dcol[] = { 0, 1, 0, -1 };
        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && ncol >= 0 && nrow < m && ncol < n && vis[nrow][ncol] == 0 && board[nrow][ncol] == 'O')
                dfs(board, vis, nrow, ncol);
        }
    }
}