class Solution {
    public String sortString(String s) {
       int chars[]=new int[26];
       for(var i:s.toCharArray()){
        chars[i-'a']++;
       }
       StringBuilder sb=new StringBuilder();
       while(sb.length()<s.length()){
          for(int i=0;i<26;i++){
            if(chars[i]!=0){
                sb.append((char)(i+'a'));
                chars[i]--;
            }
          }
          for(int i=25;i>=0;i--){
            if(chars[i]!=0){
                sb.append((char)(i+'a'));
                chars[i]--;
            }
          }
       }return sb.toString();
           }
}