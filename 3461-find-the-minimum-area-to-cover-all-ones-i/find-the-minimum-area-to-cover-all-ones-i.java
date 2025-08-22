class Solution {
    public int minimumArea(int[][] grid) {
       int sr=-1,sc=-1,lr=-1,lc=-1;
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
             if(grid[i][j]==1){
                if(sr==-1) sr=i;
                if(sc==-1) sc=j;
                else sc=Math.min(sc,j);
                lr=i;
                lc=Math.max(lc,j);
             }
           }
        }
        System.out.println(sr+" "+lr+" "+sc+" "+lc);
        if(sr==-1) return -1;
        int row=lr-sr+1;
        int col=lc-sc+1;
        return row*col;
    }
}