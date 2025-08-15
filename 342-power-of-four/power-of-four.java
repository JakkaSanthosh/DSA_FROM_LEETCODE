class Solution {
    public boolean isPowerOfFour(int n) {
      double x=Math.log10(n)/Math.log10(4);
      return (int)x-x==0;  
    }
}