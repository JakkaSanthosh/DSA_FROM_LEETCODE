import java.util.Arrays;
import java.util.TreeMap;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, h = nums.length - 1;
            while (l < h) {
                int s = nums[i] + nums[l] + nums[h];

                // If we find the exact match, return immediately
                if (s == target) return s;

                int diff = Math.abs(target - s);

                // Update only if this sum is smaller (or preferred)
                mp.putIfAbsent(diff, s); // Add only if not present
                if (mp.get(diff) > s) {
                    mp.put(diff, s); // Replace only if the sum is smaller
                }

                // Move pointers
                if (s < target) {
                    l++;
                } else {
                    h--;
                }
            }
        }

        return mp.firstEntry().getValue();  // Return the closest sum
    }
}
