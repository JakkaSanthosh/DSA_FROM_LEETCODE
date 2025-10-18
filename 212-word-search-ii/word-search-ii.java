class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> wordSet = new HashSet<>();
        Set<String> prefixSet = new HashSet<>();

        // Build word set and prefix set
        for (String w : words) {
            wordSet.add(w);
            for (int i = 1; i <= w.length(); i++)
                prefixSet.add(w.substring(0, i));
        }

        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        Set<String> res = new HashSet<>();

        // Board-first DFS
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, "", vis, wordSet, prefixSet, res);
            }
        }

        return new ArrayList<>(res);
    }

    private void dfs(char[][] board, int row, int col, String path, boolean[][] vis,
                     Set<String> wordSet, Set<String> prefixSet, Set<String> res) {

        int m = board.length, n = board[0].length;

        // Boundaries and visited check
        if (row < 0 || col < 0 || row >= m || col >= n || vis[row][col])
            return;

        path += board[row][col];

        // ❌ If current path is not a prefix of any word → stop DFS
        if (!prefixSet.contains(path))
            return;

        // ✅ If path is a word → add to result
        if (wordSet.contains(path))
            res.add(path);

        vis[row][col] = true;

        // Explore 4 directions
        dfs(board, row + 1, col, path, vis, wordSet, prefixSet, res);
        dfs(board, row - 1, col, path, vis, wordSet, prefixSet, res);
        dfs(board, row, col + 1, path, vis, wordSet, prefixSet, res);
        dfs(board, row, col - 1, path, vis, wordSet, prefixSet, res);

        vis[row][col] = false; // backtrack
    }
}
