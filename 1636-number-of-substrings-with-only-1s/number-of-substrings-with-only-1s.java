class Solution {
    public int numSub(String s) {
        int cnt = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (i > 0 && s.charAt(i) == s.charAt(i - 1))
                    cnt++;
                else
                    cnt = 1;
                res = (int) ((res + cnt) % (1e9 + 7));
            }
        }
        return res;
    }
}