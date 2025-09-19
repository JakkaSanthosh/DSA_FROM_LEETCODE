class Spreadsheet {
    int mat[][];

    public Spreadsheet(int rows) {
        mat = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1))-1;
        mat[row][col] = value;

    }

    public void resetCell(String cell) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1))-1;
        mat[row][col] = 0;
    }

    public int getValue(String formula) {
        int idx = formula.indexOf('+');
        int row1 = -1, row2 = -1, col1 = -1, col2 = -1;
        if (Character.isLetter(formula.charAt(1))) {
            col1 = formula.charAt(1) - 'A';
            row1 = Integer.parseInt(formula.substring(2, idx))-1;
        }
        if (Character.isLetter(formula.charAt(idx + 1))) {
            col2 = formula.charAt(idx + 1) - 'A';
            row2 = Integer.parseInt(formula.substring(idx + 2))-1;
        }
        int val1 = 0, val2 = 0;
        if (row1 != -1)
            val1 = mat[row1][col1];
        else
            val1 = Integer.parseInt(formula.substring(1, idx));
        if (row2 != -1)
            val2 = mat[row2][col2];
        else
            val2 = Integer.parseInt(formula.substring(idx + 1));
        return val1 + val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */