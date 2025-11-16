class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int res[][] = new int[n][n];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][2]; j++)
                for (int k = queries[i][1]; k <= queries[i][3]; k++)
                    res[j][k] += 1;
        }
        return res;
    }
}