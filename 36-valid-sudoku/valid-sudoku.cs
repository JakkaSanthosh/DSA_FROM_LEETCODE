public class Solution {
    public bool IsValidSudoku(char[][] board) {
        int[,] RowCheck=new int[9,9];
        int[,] ColCheck=new int[9,9];
        int[,] GridCheck=new int[9,9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int num=board[i][j]-'1';
                int idx=i/3*3+j/3;
                if(RowCheck[i,num]==1||ColCheck[j,num]==1||GridCheck[idx,num]==1) return false;
                RowCheck[i,num]=1;
                ColCheck[j,num]=1;
                GridCheck[idx,num]=1;
            }
        }
        return true;
    }
}