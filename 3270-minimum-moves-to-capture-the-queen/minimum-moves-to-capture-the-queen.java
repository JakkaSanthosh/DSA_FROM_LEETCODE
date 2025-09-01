class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        int maxMoves = 2;
        if (a == e) {
            if (c == a) {
                int min = Math.min(b, f);
                int max = Math.max(b, f);
                if (d > min && d < max)
                    return 2;
                else
                    return 1;
            } else
                return 1;
        } else if (b == f) {
            if (b == d) {
                int min = Math.min(a, e);
                int max = Math.max(a, e);
                if (c > min && c < max)
                    return 2;
                else
                    return 1;
            } else
                return 1;
        } else {
            if (c - d == e - f) {
                if (c - d == a - b) {
                    int rsum = e + f;
                    int osum = c + d;
                    int esum = a + b;
                    if (Math.min(rsum, osum) < esum && esum < Math.max(rsum, osum))
                        return 2;
                    else
                        return 1;
                } else
                    return 1;
            } else if (c + d == e + f) {
                if (c + d == a + b) {
                    int minRow = Math.min(e, c);
                    int maxRow = Math.max(e, c);
                    if (a > minRow && a < maxRow)
                        return 2;
                    else
                        return 1;
                } else
                    return 1;
            }
        }
        return 2;
    }
}