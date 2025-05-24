class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int a[]=new int[2];
        if(s.length()==0) return a;
        int c=0,lc=1;
         for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(c+widths[(int)(ch-97)]<=100){
               c+=widths[(int)(ch-97)];
          }
          else{
            lc++;
            c=0;
            c+=widths[(int)(ch-97)];
         }}
         return new int[]{lc,c};
    }
}