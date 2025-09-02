class Solution {
    public int binaryGap(int n) {
        int max = 0, cnt = 0, fi = -1, si = -1, oc = 0;
        while (n > 0) {
            cnt++;
            if ((n & 1) == 1) {
                oc++;
                if (oc % 2 == 1)
                    fi = cnt;
                else
                    si = cnt;
                System.out.println(fi + " " + si);
                if (fi != -1 && si != -1 && Math.abs(si - fi) > max)
                    max = Math.abs(si - fi);
            }
            n >>= 1;
        }
        return max;
    }
}