import java.util.List;

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // Edge case: If k == 1, any single element is an increasing subsequence.
        if (k == 1) {
            return true;
        }

        int c1 = 0, c2 = 0, in = 0, nxt = 0;
        boolean m = false;

        // Iterate through the list
        for (int i = 0; i < nums.size() - 1; i++) {
            in = 0;
            nxt = 0;

            // Check if there's an increasing subsequence
            if (nums.get(i) < nums.get(i + 1)) {
                int j = i;
                boolean f = true;

                // Find the first increasing subsequence
                while (j < nums.size() - 1 && nums.get(j) < nums.get(j + 1)) {
                    j++;
                    f = false;
                    in++;
                    if (in == k - 1) break; // Stop once we find the first subsequence of length k
                }

                c1 = j;  // Set the end of the first subsequence
                j++;  // Move past the last element of the first subsequence

                // Check for a second increasing subsequence
                if (j < nums.size() - 1 && nums.get(j) < nums.get(j + 1)) {
                    c2 = j;
                    while (j < nums.size() - 1 && nums.get(j) < nums.get(j + 1)) {
                        j++;
                        nxt++;
                        if (nxt == k - 1) break; // Stop once we find the second subsequence of length k
                    }
                }
            }

            // Check if both subsequences have length k
            if (c1 + 1 == c2 && in == k - 1 && nxt == k - 1) {
                return true;
            }
        }
        
        return false;
    }
}