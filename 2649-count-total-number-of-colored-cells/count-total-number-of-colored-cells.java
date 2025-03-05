class Solution {
    public long coloredCells(int n) {
      if(n==0) return 0;
      long sum=1;
      for(int i=2;i<=n;i++){
        sum+=(i-1)*4;
      }
      return sum;  
    }
}