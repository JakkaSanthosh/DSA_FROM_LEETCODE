class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (var i : queries) {
            res.add(matches(i, pattern));
        }
        return res;
    }

    static boolean matches(String s, String pattern) {
        int ptr = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ptr < pattern.length() && ch == pattern.charAt(ptr))
                ptr++;
            else if (Character.isUpperCase(ch))
                return false;
        }
        return ptr == pattern.length();
    }
}