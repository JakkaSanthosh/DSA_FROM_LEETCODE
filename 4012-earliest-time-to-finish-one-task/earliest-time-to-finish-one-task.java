class Solution {
    public int earliestTime(int[][] tasks) {
        int min = 9999999;
        for (var i : tasks) {
            int sum = i[0] + i[1];
            min = Math.min(min, sum);
        }
        return min;
    }
}