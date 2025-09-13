class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int pre[]=new int[m*n];
        int suff[]=new int[m*n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0) {
                    if(i==0) pre[idx]=grid[0][0]%12345;
                    else 
                        pre[idx]=((pre[idx-1]%12345)*(grid[i][j]%12345))%12345;
                    }
               else  pre[idx]=((pre[idx-1]%12345)*(grid[i][j]%12345))%12345;
               idx++;
            }
        }
        idx-=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(j==n-1)
                     if(i==m-1) suff[idx]=grid[i][j]%12345;
                    else suff[idx]=((suff[idx+1]%12345)*(grid[i][j]%12345))%12345;
               else  suff[idx]=((suff[idx+1]%12345)*(grid[i][j]%12345))%12345; 
                idx--;
            }
        }
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int k=i*n+j;
                if(i==0&&j==0) res[i][j]=suff[k+1]%12345;
                else if(i==m-1&&j==n-1) res[i][j]=pre[k-1]%12345;
                else res[i][j]=(pre[k-1]*suff[k+1])%12345;
            }
        }
        return res;
    }
}