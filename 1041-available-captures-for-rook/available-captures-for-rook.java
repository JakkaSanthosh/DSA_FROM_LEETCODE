class Solution {
    public int numRookCaptures(char[][] board) {
        int c=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                        for(int k=j+1;k<board[0].length;k++){
                            if(board[i][k]!='.'){
                                if(board[i][k]=='p') c++;
                                break;
                            }
                        }
                    for(int k=j-1;k>=0;k--){
                            if(board[i][k]!='.'){
                                if(board[i][k]=='p') c++;
                                break;
                            }
                        }
                        for(int k=i-1;k>=0;k--){
                            if(board[k][j]!='.'){
                                if(board[k][j]=='p') c++;
                                break;
                            }
                        }
                        for(int k=i+1;k<board.length;k++){
                            if(board[k][j]!='.'){
                                if(board[k][j]=='p') c++;
                                break;
                            }
                        }
                        break;
                }
            }
        }
        return c; 
    }
}