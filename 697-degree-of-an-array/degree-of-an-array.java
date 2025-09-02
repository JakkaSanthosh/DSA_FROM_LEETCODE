class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> al=new ArrayList<>();
        int maxLen = 50000, deg = 1;
        for (var i : nums) {
            mp.put(i, 1 + mp.getOrDefault(i, 0));
            al.add(i);
        }
        for (var i : mp.keySet()) {
            if (mp.get(i) >= deg) {
                int fi = al.indexOf(i);
                int li = al.lastIndexOf(i);
                if (mp.get(i) == deg)
                    maxLen = Math.min(maxLen, li - fi + 1);
                else
                    maxLen = li - fi + 1;
                deg = mp.get(i);
            }
        }
        return maxLen;
    }
}