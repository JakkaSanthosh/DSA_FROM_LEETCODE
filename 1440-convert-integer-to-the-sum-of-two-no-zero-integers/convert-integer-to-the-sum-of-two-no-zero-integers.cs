public class Solution {
    public int[] GetNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!(i + "").Contains("0") && !(j + "").Contains("0"))
                return new int[] { i, j };
        }
        return new int[0];
    }
}