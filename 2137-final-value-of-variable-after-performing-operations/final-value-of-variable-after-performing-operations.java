class Solution {
    public int finalValueAfterOperations(String[] o) {   
        int X=0;
        for(int i=0;i<o.length;i++){
            if(o[i].equals("X--")||o[i].equals("--X")){
                X--;
            }
            else X++;
        }
        return X;
     }
}