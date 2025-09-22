class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (var i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        long res = 0;
        while (k > 0) {
            res = res + max - min;
            k--;
        }
        return res;
    }
}