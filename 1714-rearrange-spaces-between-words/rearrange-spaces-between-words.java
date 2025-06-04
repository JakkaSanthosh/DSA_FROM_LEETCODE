class Solution {
    public String reorderSpaces(String text) {
        int sc=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ') sc++;
        }
        text=text.trim();
        String x="";
        String a[]=text.split("\\s+");
        if(a.length==1){
           x+=a[0];
           x+=" ".repeat(sc);
           return x;
        }
        int spacecnt=sc/(a.length-1);
        int rem=sc%(a.length-1);
        for(int i=0;i<a.length;i++){
            x+=a[i];
            if(i<a.length-1) x+=" ".repeat(spacecnt);
    }
    if(rem!=0) x+=" ".repeat(rem);
    return x;
}}