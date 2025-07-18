class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        Arrays.sort(divisors);
        int freq = -1, res = Integer.MAX_VALUE;
        for (int i = 0; i < divisors.length; i++) {
            if (divisors[i] == 0)
                continue;
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0)
                    cnt++;
            }
            if (cnt > freq) {
                freq = cnt;
                res = divisors[i];
            }
        }
        if (res == Integer.MAX_VALUE)
            return divisors[0];
        return res;
    }
}