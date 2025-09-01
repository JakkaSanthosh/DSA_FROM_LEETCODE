class Solution {
    public int appendCharacters(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (!s.contains(t.charAt(i) + ""))
                return t.length() - i;
            else {
                int idx = s.indexOf(t.charAt(i));
                s = s.substring(idx + 1);
            }
        }
        return 0;
    }
}