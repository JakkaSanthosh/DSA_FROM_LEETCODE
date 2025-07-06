class Solution {
    public String concatHex36(int n) {
       String x=Integer.toString(n*n,16);
       String y=Integer.toString(n*n*n,36);
       StringBuilder sb=new StringBuilder();
       for(var i:(x+y).toCharArray()){
         if(Character.isLowerCase(i)) sb.append(Character.toUpperCase(i));
         else sb.append(i);
       }
       return sb.toString();
    }
}