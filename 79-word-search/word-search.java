class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int vis[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && vis[i][j] == 0) {
                    if (dfs(board, vis, word, 0, i, j))
                        return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, int[][] vis, String s, int idx, int row, int col) {
        vis[row][col] = 1;
        if (idx == s.length() - 1)
            return true;
        int drow[] = { -1, 0, 1, 0 };
        int dcol[] = { 0, 1, 0, -1 };
        int m = board.length, n = board[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0
                    && board[nrow][ncol] == s.charAt(idx + 1)) {
                if (dfs(board, vis, s, idx + 1, nrow, ncol))
                    return true;
            }
        }
         vis[row][col] = 0;
        return false;
    }
}