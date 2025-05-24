class Solution {
    public boolean validPalindrome(String s) {
       int left=0,right=s.length()-1;
      while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return checkPalindrome(s,left+1,right)||checkPalindrome(s,left,right-1);
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    static boolean checkPalindrome(String s,int i,int j){
        while(i<j){
          if(s.charAt(i)!=s.charAt(j)) return false;
          else{
            i++;
            j--;
          }
        }
        return true;
    }
}