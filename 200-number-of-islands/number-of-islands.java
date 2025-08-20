class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n],cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    static void bfs(int r,int c,int[][] vis,char grid[][]){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        vis[r][c]=1;
        int m=grid.length;
        int n=grid[0].length;
        int drow[]={-1,1,0,0};
        int dcol[]={0,0,-1,1};
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();
            for(int k=0;k<4;k++){
                int nrow=drow[k]+row;
                int ncol=dcol[k]+col;
                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&vis[nrow][ncol]==0&&grid[nrow][ncol]=='1'){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
               
            }
        }
    }
}