class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            List<Character> al = new ArrayList<>();
            for (int j = 0; j < words[i].length(); j++) {
                al.add(words[i].charAt(j));
            }
            for (int j = 0; j < chars.length(); j++) {
                if (al.contains(chars.charAt(j))) {
                    al.remove(Character.valueOf(chars.charAt(j)));
                }
            }
            if (al.isEmpty())
                ans += words[i].length();
        }
        return ans;
    }
}