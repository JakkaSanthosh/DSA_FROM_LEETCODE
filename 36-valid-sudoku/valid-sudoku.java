class Solution {
public boolean isValidSudoku(char[][] board) {
boolean[][] rowCheck = new boolean[9][9];
boolean[][] colCheck = new boolean[9][9];
boolean[][] gridCheck = new boolean[9][9];

for (int row = 0; row < 9; row++) {
for (int col = 0; col < 9; col++) {
if (board[row][col] == '.') continue; // Skip empty cells

int num = board[row][col] - '1'; // Convert '1'-'9' to 0-8
int gridIndex = (row / 3) * 3 + (col / 3); // Identify 3x3 grid

// Check if num is already present in row, column, or grid
if (rowCheck[row][num] || colCheck[col][num] || gridCheck[gridIndex][num]) {
return false;
}

// Mark number as seen
rowCheck[row][num] = true;
colCheck[col][num] = true;
gridCheck[gridIndex][num] = true;
}
}
return true;
}
}

