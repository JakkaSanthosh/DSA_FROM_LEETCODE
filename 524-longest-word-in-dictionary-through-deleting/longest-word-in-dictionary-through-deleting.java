class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, (a, b) -> {
            if (a.length() != b.length())
                return a.length() - b.length();
            return a.compareTo(b);
        });
        String res = "";
        for (int i = 0; i < dictionary.size(); i++) {
            int p1 = 0, p2 = 0;
            while (p1 < s.length() && p2 < dictionary.get(i).length()) {
                if (s.charAt(p1) == dictionary.get(i).charAt(p2)) {
                    p1++;
                    p2++;
                } else
                    p1++;
            }
            if (p2 == dictionary.get(i).length() && p2 > res.length())
                res = dictionary.get(i);
        }
        return res;
    }
}