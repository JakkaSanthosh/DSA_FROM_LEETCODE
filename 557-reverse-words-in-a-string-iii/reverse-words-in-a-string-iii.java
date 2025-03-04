class Solution {
    public String reverseWords(String s) {
        String a[]=s.split("\\s+");
        String x="";
        for(int i=0;i<a.length;i++){
             x+=reverse(a[i]);
             if(i<a.length-1) x+=" ";
        }
        return x;
    }
    static String reverse(String s){
    String x="";
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        x=c+x;
    }return x;
    }
}