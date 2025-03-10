class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            char c=sb.charAt(i);
            char d=sb.charAt(i+1);
            if(c==d){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
               i = Math.max(-1, i - 2);
            }
        }
        return sb.toString();
    }
}