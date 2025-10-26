class Solution {
    public long removeZeros(long n) {
        String s = n + "";
        String ans = "";
        for (var i : s.toCharArray()) {
            if (i != '0')
                ans += i;
        }
        return Long.parseLong(ans);
    }
}