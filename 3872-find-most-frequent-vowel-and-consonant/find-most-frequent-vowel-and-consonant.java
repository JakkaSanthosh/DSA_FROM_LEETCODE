class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int maxVow = 0, maxCon = 0;
        for (var i : s.toCharArray()) {
            mp.put(i, 1 + mp.getOrDefault(i, 0));
            if ("aeiou".contains(i + ""))
                maxVow = Math.max(maxVow, mp.get(i));
            else
                maxCon = Math.max(maxCon, mp.get(i));
        }
        return maxVow + maxCon;
    }
}