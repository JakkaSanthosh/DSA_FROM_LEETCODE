class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n=grid.length;
      int k=0;
      int a[]=new int[n*n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           a[k++]=grid[i][j];
        }
      } 
      int x[]=new int[2];
      Set<Integer> s=new HashSet<>();
      for(int i=0;i<a.length;i++){
    if(s.contains(a[i])){
        x[0]=a[i];
    }
    if(!s.contains(a[i])){
        s.add(a[i]);
    }
      }
      for(int i=1;i<=a.length;i++){
        if(!s.contains(i)){
            x[1]=i;
            break;
        }
      }
      return x;}}