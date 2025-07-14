class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122) sb.append(s.charAt(i));
            else if(s.charAt(i)=='*'&&!sb.isEmpty()) sb.deleteCharAt(sb.length()-1);
            else if(s.charAt(i)=='%'&&!sb.isEmpty()) sb.reverse();
            else if(s.charAt(i)=='#'&&!sb.isEmpty()) sb.append(sb);
        }
        return sb.toString();
    }
}