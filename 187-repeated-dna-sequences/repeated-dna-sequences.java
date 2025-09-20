class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> al = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (i + 10 <= s.length()) {
                String x = s.substring(i, i + 10);
                mp.put(x, 1 + mp.getOrDefault(x, 0));
            } else
                break;
        }
        for (var i : mp.keySet()) {
            if (mp.get(i) > 1)
                al.add(i);
        }
        return al;
    }
}