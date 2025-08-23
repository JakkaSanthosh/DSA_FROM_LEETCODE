class Pair {
    int first, second, steps;

    Pair(int first, int second, int steps) {
        this.first = first;
        this.second = second;
        this.steps = steps;
    }
}

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        int[][] vis = new int[m][n], res = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    vis[i][j] = 1;
                    q.offer(new Pair(i, j, 0));
                }
            }
        }
        int delRow[] = { -1, 0, 1, 0 };
        int delCol[] = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int dist = q.peek().steps;
            q.poll();
            res[row][col] = dist;
            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.offer(new Pair(nrow, ncol, dist + 1));
                }
            }
        }
        return res;
    }
}