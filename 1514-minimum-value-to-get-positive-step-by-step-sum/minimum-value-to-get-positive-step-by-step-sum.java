class Solution {
    public int minStartValue(int[] nums) {
        int min = 0, sum = 0;
        for (var i : nums) {
            sum += i;
            min = Math.min(min, sum);
        }
        if (min < 1)
            return Math.abs(min) + 1;
        return 1;
    }
}