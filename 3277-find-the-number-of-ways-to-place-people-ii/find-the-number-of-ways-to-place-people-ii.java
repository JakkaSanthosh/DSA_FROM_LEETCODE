class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return b[1] - a[1];
        });
        int cnt = 0;
        for (int i = 0; i < points.length; i++) {
            int y1 = points[i][1];
            int maxY = Integer.MIN_VALUE;
            for (int j = i + 1; j < points.length; j++) {
                if (points[j][1] <= y1) {
                    if (points[j][1] > maxY)
                        cnt++;
                    maxY = Math.max(maxY, points[j][1]);
                }
            }
        }
        return cnt;
    }
}