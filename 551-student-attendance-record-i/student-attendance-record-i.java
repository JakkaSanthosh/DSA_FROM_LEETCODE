class Solution {
    public boolean checkRecord(String s) {
       int ac=0,pc=0,lc=0;
       for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(c=='A') {
            ac++;
            lc=0;}
          else if(c=='P') {
            pc++;
            lc=0;}
          else{
             if(lc==2) return false;
             else lc++;
          }
       } 
       if(ac>=2) return false;
       return true;

    }
}