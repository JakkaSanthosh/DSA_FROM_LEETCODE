class Solution {
    public int smallestNumber(int n) {
       int len=Integer.toBinaryString(n).length();
       return Integer.parseInt("1".repeat(len),2);
    }
}