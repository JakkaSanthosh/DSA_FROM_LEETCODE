class Solution {
    public boolean checkString(String s) {
        int idx = s.indexOf('b');
        if (idx == -1)
            return true;
        s = s.substring(idx);
        return !s.contains("a");
    }
}