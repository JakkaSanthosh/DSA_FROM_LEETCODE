class Solution {
    public int countHomogenous(String s) {
        int cnt = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1))
                cnt++;
            else
                cnt = 1;
            sum = (int)(((sum%(1e9+7))+(cnt%(1e9+7)))%(1e9+7));
        }
        return sum;
    }
}