class Solution {
    public String reverseVowels(String s) {
        int p1=0,p2=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(p1<=p2){
            char c=sb.charAt(p1);
            char d=sb.charAt(p2);
            if("aeiouAEIOU".indexOf(c)!=-1&&"aeiouAEIOU".indexOf(d)!=-1){
                sb.setCharAt(p1, d);
                sb.setCharAt(p2, c);
            p1++;p2--;
            }
            else if("aeiouAEIOU".indexOf(c)!=-1&&"aeiouAEIOU".indexOf(d)==-1) p2--;
            else p1++;
        }
          return sb.toString();   
    }
}