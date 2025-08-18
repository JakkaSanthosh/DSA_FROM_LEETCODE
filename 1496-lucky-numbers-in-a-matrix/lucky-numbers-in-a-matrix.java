class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowMin[] = preCompute(matrix, m, n, 0);
        int colMax[] = preCompute(matrix, n, m, 1);
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowMin[i] == colMax[j])
                    al.add(matrix[i][j]);
            }
        }
        return al;
    }

    static int[] preCompute(int matrix[][], int m, int n, int k) {
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            if (k == 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    min = Math.min(matrix[i][j], min);
                }
                a[i] = min;
            } else {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    max = Math.max(matrix[j][i], max);
                }
                a[i] = max;
            }
        }
        return a;
    }
}