class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long totalHours = 0;  // use long to avoid overflow

            for (int pile : piles) {
                // Inline ceiling calculation without ceil function
                totalHours += (pile + (long)mid - 1) / mid;
            }

            if (totalHours <= h) {
                answer = mid;
                right = mid - 1; // try slower speed
            } else {
                left = mid + 1;  // try faster speed
            }
        }

        return answer;
    }

   
}
