class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        for(int i=0;i<n;i++){
            if(vis[0][i]==0&&grid[0][i]==1) dfs(grid,vis,delRow,delCol,0,i);
            if(vis[m-1][i]==0&&grid[m-1][i]==1) dfs(grid,vis,delRow,delCol,m-1,i);
        }
        for(int i=0;i<m;i++){
            if(vis[i][0]==0&&grid[i][0]==1) dfs(grid,vis,delRow,delCol,i,0);
            if(vis[i][n-1]==0&&grid[i][n-1]==1) dfs(grid,vis,delRow,delCol,i,n-1);
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0&&grid[i][j]==1) cnt++;
            }
        }
        return cnt;
    }
    static void dfs(int grid[][],int vis[][],int delRow[],int delCol[],int row,int col){
        vis[row][col]=1;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&vis[nrow][ncol]==0&&grid[nrow][ncol]==1)
             dfs(grid,vis,delRow,delCol,nrow,ncol);
        }
    }
}