class Solution {
    public String firstPalindrome(String[] w) {
        //String x="";
        for(int i=0;i<w.length;i++){
            if(isPalindrome(w[i])) return w[i];
        }
        return "";
    }
    static boolean isPalindrome(String s){
        int l=0,h=s.length()-1;
        while(l<h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;h--;
        }return true;
    }
}