class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int res[][]=new int[mat.length][mat[0].length];
       int vis[][]=new int[mat.length][mat[0].length];
       Queue<Pair> q=new LinkedList<>();
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==0){
                vis[i][j]=1;
                q.offer(new Pair(i,j,0));
            }
        }
       }
       int drow[]={-1,0,1,0};
       int dcol[]={0,1,0,-1};
       while(!q.isEmpty()){
        int sr=q.peek().row;
        int sc=q.peek().col;
        int steps=q.peek().move;
        q.poll();
        res[sr][sc]=steps;
        for(int i=0;i<4;i++){
            int nrow=sr+drow[i];
            int ncol=sc+dcol[i];
            if(nrow>=0&&nrow<mat.length&&ncol>=0&&ncol<mat[0].length&&vis[nrow][ncol]==0){
                vis[nrow][ncol]=1;
                q.add(new Pair(nrow,ncol,steps+1));
            }
        }
       }
       return res;
    }
}
class Pair{
    int row,col,move;
    Pair(int row,int col,int move){
        this.row=row;
        this.col=col;
        this.move=move;
    }
}