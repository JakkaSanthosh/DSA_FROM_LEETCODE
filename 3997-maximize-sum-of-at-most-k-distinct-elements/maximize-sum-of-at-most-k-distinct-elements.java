class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> hs = new TreeSet<>(Collections.reverseOrder());
        for (var i : nums)
            hs.add(i);
        int len = hs.size() <= k ? hs.size() : k;
        int res[] = new int[len], idx = 0;
        for (var i : hs) {
            res[idx++] = i;
            if (idx == len)
                break;
        }
        return res;
    }
}