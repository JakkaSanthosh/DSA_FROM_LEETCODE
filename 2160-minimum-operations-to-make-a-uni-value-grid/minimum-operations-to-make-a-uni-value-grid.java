class Solution {
    public int minOperations(int[][] grid, int x) {
        int a[]=new int[grid.length*grid[0].length];
        int k=0,c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[k++]=grid[i][j];
            }
        }
        Arrays.sort(a);
        int x1=a[a.length/2];
        for(int i=0;i<a.length;i++){
            if(a[i]<x1){
                while(a[i]!=x1){
                  c++;
                  a[i]+=x;
                  if(a[i]>x1) return -1;
                }
            }
           else if(a[i]>x1){
            while(a[i]!=x1){
                c++;
                a[i]-=x;
                if(a[i]<x1) return -1;
            }
           } 
        }
        return c;
    }
}