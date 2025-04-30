class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1, high = piles[piles.length - 1], res = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long reqHours = 0;
            for (int i : piles)
                reqHours += (i + (long) mid - 1) / mid;
            if (reqHours <= h) {
                res = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return res;
    }
}