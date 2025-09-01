class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for (var i : word1.toCharArray())
            mp1.put(i, mp1.getOrDefault(i, 0) + 1);
        for (var i : word2.toCharArray())
            mp2.put(i, mp2.getOrDefault(i, 0) + 1);
        for (var i : mp1.keySet()) {
            if (!mp2.containsKey(i))
                return false;
        }
        for (var i : mp2.keySet()) {
            if (!mp1.containsKey(i))
                return false;
        }
        List<Integer> freq1 = new ArrayList<>(mp1.values());
        List<Integer> freq2 = new ArrayList<>(mp2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}