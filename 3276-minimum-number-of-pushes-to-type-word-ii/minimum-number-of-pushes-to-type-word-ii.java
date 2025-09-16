class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> mp = new HashMap<>();
        for (var i : word.toCharArray()) {
            mp.put(i, 1 + mp.getOrDefault(i, 0));
        }
        if (mp.size() <= 8)
            return word.length();
        List<Character> al = new ArrayList<>(mp.keySet());
        Collections.sort(al, (a, b) -> {
            return mp.get(b) - mp.get(a);
        });
        int res = 0;
        for (int i = 0; i < al.size(); i++) {
            if (i <= 7)
                res += mp.get(al.get(i));
            else if (i <= 15)
                res = res + mp.get(al.get(i)) * 2;
            else if (i <= 23)
                res = res + mp.get(al.get(i)) * 3;
            else
                res = res + mp.get(al.get(i)) * 4;
        }
        return res;
    }
}