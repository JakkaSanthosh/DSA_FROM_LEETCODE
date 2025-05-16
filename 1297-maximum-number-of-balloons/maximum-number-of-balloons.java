class Solution {
    public int maxNumberOfBalloons(String text) {
      int bc=0,ac=0,nc=0,lc=0,oc=0;
      for(var i:text.toCharArray()){
        if(i=='b') bc++;
        else if(i=='a') ac++;
        else if(i=='l') lc++;
        else if(i=='o') oc++;
        else if(i=='n') nc++;   
      }
      int c=0;
      while(bc>0&&ac>0&&nc>0&&lc>1&&oc>1){
        c++;
        bc--;
        ac--;
        nc--;
        lc-=2;
        oc-=2;
      }
return c;
    }
}