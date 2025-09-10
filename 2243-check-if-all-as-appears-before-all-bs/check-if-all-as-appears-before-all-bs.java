class Solution {
    public boolean checkString(String s) {
        boolean occB = false;
        for (var i : s.toCharArray()) {
            if (i == 'b')
                occB = true;
            else {
                if (occB)
                    return false;
            }
        }
        return true;
    }
}