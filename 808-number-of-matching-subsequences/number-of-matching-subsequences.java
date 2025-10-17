class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> mp = new HashMap<>();
        int cnt = 0;
        for (var i : words) {
            mp.put(i, 1 + mp.getOrDefault(i, 0));
        }
        for (var i : mp.keySet()) {
            if (s.length() < i.length())
                continue;
            int j = 0, k = 0;
            while (k < i.length() && j < s.length()) {
                if (i.charAt(k) == s.charAt(j))
                    k++;
                j++;
            }
            if (k == i.length())
                cnt += mp.get(i);
        }
        return cnt;
    }
}