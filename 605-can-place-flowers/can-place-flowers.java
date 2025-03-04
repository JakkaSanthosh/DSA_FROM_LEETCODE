class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        // Go through the flowerbed array
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current position is empty and the adjacent positions are also empty or out of bounds
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Place a flower
                flowerbed[i] = 1;
                count++;
                
                // If we've placed enough flowers, return true
                if (count >= n) {
                    return true;
                }
            }
        }
        
        return count >= n;
    }
}
