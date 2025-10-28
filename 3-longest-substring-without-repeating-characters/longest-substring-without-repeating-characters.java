class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;  // start of the current window
        Map<Character, Integer> mp = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // If duplicate found, move left pointer
            if (mp.containsKey(ch) && mp.get(ch) >= left) {
                left = mp.get(ch) + 1;
            }

            mp.put(ch, right);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
