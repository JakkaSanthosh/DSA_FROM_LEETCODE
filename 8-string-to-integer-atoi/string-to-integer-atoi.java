class Solution {
    public int myAtoi(String str) {
    str = str.trim();
    if (str.isEmpty()) return 0;
    int sign = 1;
    int i = 0;
    long base = 0;
    if (str.charAt(i) == '-' || str.charAt(i) == '+') {
        sign = str.charAt(i) == '-' ? -1 : 1;
        i++;
    }
    while (i < str.length() && Character.isDigit(str.charAt(i))) {
        int digit = str.charAt(i) - '0';
        base = base * 10 + digit;
        if (sign == 1 && base > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign == -1 && -base < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;
    }
    return (int) (base * sign);
}
    }