class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if (n <= 8)
            return n;
        int parts = n / 8;
        int rem = n % 8;
        int res = 0, i = 1;
        while (i <= parts) {
            res = res + 8 * i;
            i++;
        }
        res = res + (rem * i);
        return res;
    }
}