class Solution {
    public String reverseVowels(String s) {
        int p1=0,p2=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(p1<=p2){
            char c=sb.charAt(p1);
            char d=sb.charAt(p2);
            if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')&&(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U')){
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