class Solution {
    public long maxAlternatingSum(int[] nums) {
        long res = 0;
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (var i : nums) {
            min.offer(Math.abs(i));
            max.offer(Math.abs(i));
        }
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            res += (long) Math.pow(max.poll(), 2);
            res -= (long) Math.pow(min.poll(), 2);
        }
        if (n % 2 == 1)
            res += (long) Math.pow(max.poll(), 2);
        return res;
    }
}