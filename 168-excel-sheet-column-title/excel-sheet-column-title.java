class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 26) {
            columnNumber--;
            int r = columnNumber % 26;
            res = (char) (65 + r) + res;
            columnNumber /= 26;
        }
        if (columnNumber != 0)
            res = (char) (64 + columnNumber) + res;
        return res;
    }
}