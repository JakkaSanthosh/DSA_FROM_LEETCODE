class Solution {
    public int secondsToRemoveOccurrences(String s) {
       int cnt=0;
       StringBuilder sb=new StringBuilder(s);
       for(int k=0;k<sb.length();k++){
        int flag=-1;
       for(int i=0;i<sb.length()-1;i++){
        if(sb.charAt(i)=='0'&&sb.charAt(i+1)=='1'){
            sb.setCharAt(i,'1');
            sb.setCharAt(i+1,'0');
            i++;
            flag=1;
        }}
        if(flag==-1) break;
        cnt++;
       }
       return cnt; 
    }
}