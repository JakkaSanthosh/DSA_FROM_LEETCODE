class Solution {
    public boolean doesAliceWin(String s) {
        int cnt = 0;
        for (var i : s.toCharArray()) {
            if ("AEIOUaeiou".contains(i + ""))
                cnt++;
        }
        return cnt != 0;
    }
}