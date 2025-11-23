class Solution {
    public int minimumFlips(int n) {
       String str=Integer.toBinaryString(n);
       int i=0,j=str.length()-1;
       int cnt=0;
       while(i<j){
         if(str.charAt(i)!=str.charAt(j)) cnt+=2;
         i++;
         j--;
       }
       return cnt;
    }
}