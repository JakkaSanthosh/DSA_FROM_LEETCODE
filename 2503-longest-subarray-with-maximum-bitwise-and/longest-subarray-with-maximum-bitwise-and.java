class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for (var i : nums) {
            if (i >= max)
                max = i;
        }
        int currLen = 0;
        int res = 0;
        for (var i : nums) {
            if (i == max)
                currLen++;
            else {
                res = Math.max(currLen, res);
                currLen = 0;
            }
        }
        return Math.max(currLen, res);
    }
}