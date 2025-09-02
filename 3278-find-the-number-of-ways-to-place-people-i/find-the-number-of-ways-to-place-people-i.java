class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0], y1 = points[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                int x2 = points[j][0], y2 = points[j][1], flag = 0;
                if (x1 > x2 || y1 < y2)
                    continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;
                    int x3 = points[k][0], y3 = points[k][1];
                    if (x3 >= x1 && x3 <= x2 && y3 <= y1 && y3 >= y2) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    cnt++;
            }
        }
        return cnt;
    }
}