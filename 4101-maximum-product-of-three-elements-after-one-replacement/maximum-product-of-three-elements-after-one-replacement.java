class Solution {
    public long maxProduct(int[] nums) {
        int max = 0, smax = 0;
        for (var i : nums) {
            int k = Math.abs(i);
            if (k > max) {
                smax = max;
                max = k;
            } else if (k <= max && k >= smax)
                smax = k;
        }

        return (long) max * smax * 100000;
    }
}