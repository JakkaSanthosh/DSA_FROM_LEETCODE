class Solution {
    public void solveSudoku(char[][] board) {
        valid(board);
    }
    static boolean valid(char[][] board){
      for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.'){
            for(int num=1;num<=9;num++){
              if(isValid(board,i,j,num)){
                board[i][j]=(char)(num+'0');
                if(valid(board)){
                   return true;
                }
                board[i][j]='.';
            }
        }
       return false;
      }
      }
      }
      return true;}
    //   static void print(char board[][]){
    //     for(int i=0;i<9;i++){
    //         for(int j=0;j<9;j++){
    //             System.out.print(board[i][j]);
    //         }
    //         System.out.println();
    //     }
    //   }
  static boolean isValid(char board[][],int row,int col,int n){
    for(int i=0;i<9;i++){
        if(board[row][i]==(char)(n+'0')||board[i][col]==(char)(n+'0')) return false;
    }
     int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] ==(char)(n+'0')) {
                    return false;
                }
            }
        }

        return true;

  }
}