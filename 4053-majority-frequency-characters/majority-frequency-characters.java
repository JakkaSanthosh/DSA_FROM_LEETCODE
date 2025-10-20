class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int freq = 0;
        for (var i : s.toCharArray()) {
            mp.put(i, 1 + mp.getOrDefault(i, 0));
        }
        Map<Integer, String> mp2 = new HashMap<>();
        for (var i : mp.keySet()) {
            if (!mp2.containsKey(mp.get(i)))
                mp2.put(mp.get(i), "");
            mp2.put(mp.get(i), mp2.get(mp.get(i)) + i);
        }
        String res = "";
        int val = 0;
        for (var i : mp2.keySet()) {
            if (mp2.get(i).length() > res.length()) {
                res = mp2.get(i);
                val = i;
            } else if (mp2.get(i).length() == res.length()) {
                if (i > val) {
                    res = mp2.get(i);
                    val = i;
                }
            }
        }
        return res;
    }
}