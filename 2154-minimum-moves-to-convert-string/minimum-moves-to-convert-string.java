class Solution {
    public int minimumMoves(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
           char c1=s.charAt(i);
           if(c1=='X'){
            c++;
            i+=2;
           }  
        }
        return c;
    }
}