class Solution {
    public int oddCells(int m, int n, int[][] indices) {
     int oc=0;
     int mat[][]=new int[m][n];
     for(int i=0;i<indices.length;i++){
        fill(mat,indices[i],m,n);
     } 
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]%2==1) oc++;
        }
     } 
     return oc; 
    }
    static void fill(int a[][],int idx[],int m,int n){
        int row=idx[0];
        int col=idx[1];
        for(int j=0;j<n;j++){
            a[row][j]+=1;
        }
        for(int i=0;i<m;i++){
            a[i][col]+=1;
        }
    }
}