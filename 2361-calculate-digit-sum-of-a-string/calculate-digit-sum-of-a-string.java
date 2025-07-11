class Solution {
    public String digitSum(String s, int k) {
       while(s.length()>k){
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            if(i+k<=s.length())
            sb.append(check(s.substring(i,i+k)));
            else sb.append(check(s.substring(i)));
        }
        s=sb.toString();
       }
       return s;
    }
    static String check(String s){
       int sum=0;
       for(int i=0;i<s.length();i++){
        sum+=s.charAt(i)-'0';
       }
       return Integer.toString(sum);
    }
}