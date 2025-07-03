class Solution {
    public char kthCharacter(int n) {
        String k="a";
        String l="";
      while(k.length()<n){
        String p="";
        for(int i=0;i<k.length();i++){
        char c=k.charAt(i);
        int x=(int)c;
        if(x==122)x=97;
        p=p+(char)(x+1);
      }
      k=k+p;
      //l=l+k;
    
      
      }
        return k.charAt(n-1);
    }
}