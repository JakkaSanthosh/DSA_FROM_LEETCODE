class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        for (int x : nums) 
            mp.put(x, mp.getOrDefault(x, 0) + 1);

        int cnt = 0;
        int idx = 0; // instead of removing elements, move pointer

        while (mp.size() != (n - idx)) {
            cnt++;
            for (int k = 0; k < 3 && idx < n; k++) {
                int val = nums[idx++];
                mp.put(val, mp.get(val) - 1);
                if (mp.get(val) == 0)
                    mp.remove(val);
            }
        }

        return cnt;
    }
}
