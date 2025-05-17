class Solution {
    public String modifyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(c=='?'){
                char prev=(i==0)?'#':sb.charAt(i-1);
                char next=(i==s.length()-1)?'#':sb.charAt(i+1);
                for(char ch='a';ch<='z';ch++){
                    if(ch!=prev&&ch!=next){ sb.setCharAt(i,ch);break;}
                }
            }
            
        }
        return sb.toString();
    }
}