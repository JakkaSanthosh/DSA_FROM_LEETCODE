class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res=0,c=0;
        while(c<grid[0].length){
            int max=-9999999;
        for(int i=0;i<grid.length;i++){
            // Queue<Integer> pq=new PriorityQueue<>();
            int min=-999999,idx=-1;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>min){
              min=Math.max(min,grid[i][j]);
               idx=j;}
            }
            grid[i][idx]=-100;
            max=Math.max(min,max);
                   }
                   res+=max;
                   c++;}
                   return res;
    }
}