class Solution {
    public int smallestAbsent(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int sum = 0;
        int max = 0;
        for (var i : nums) {
            hs.add(i);
            sum += i;
            max = Math.max(max, i);
        }
        int avg = sum / nums.length;
        int i = 1;
        for (; i <= max + 1; i++) {
            if ((!hs.contains(i)) && i > avg)
                return i;
        }
        return i;
    }
}