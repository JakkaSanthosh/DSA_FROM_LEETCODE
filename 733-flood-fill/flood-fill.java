class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ans[][] = image;
        int m = image.length;
        int n = image[0].length;
        int iniColor = image[sr][sc];
        int drow[] = { -1, 0, 1, 0 };
        int dcol[] = { 0, 1, 0, -1 };
        dfs(sr, sc, image, ans, iniColor, color, drow, dcol);
        return ans;
    }

    static void dfs(int sr, int sc, int image[][], int ans[][], int iniColor, int newColor, int drow[], int dcol[]) {
        ans[sr][sc] = newColor;
        int m = image.length, n = image[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = sr + drow[i];
            int ncol = sc + dcol[i];
            if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && image[nrow][ncol] == iniColor
                    && ans[nrow][ncol] != newColor)
                dfs(nrow, ncol, image, ans, iniColor, newColor, drow, dcol);
        }
    }
}