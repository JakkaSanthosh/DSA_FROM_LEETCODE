class Solution {
    public int minimumArea(int[][] grid) {
        int startRow = -1, startCol = -1, lastRow = -1, lastCol = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (startRow == -1)
                        startRow = i;
                    if (startCol == -1)
                        startCol = j;
                    else
                        startCol = Math.min(startCol, j);
                    lastRow = i;
                    lastCol = Math.max(lastCol, j);
                }
            }
        }
        if (startRow == -1)
            return -1;
        int row = lastRow - startRow + 1;
        int col = lastCol - startCol + 1;
        return row * col;
    }
}