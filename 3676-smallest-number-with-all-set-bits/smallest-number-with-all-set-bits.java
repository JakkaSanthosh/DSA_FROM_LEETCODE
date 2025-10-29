class Solution {
    public int smallestNumber(int n) {
       int len=Integer.toBinaryString(n).length();
       return (1<<len)-1;
    }
}