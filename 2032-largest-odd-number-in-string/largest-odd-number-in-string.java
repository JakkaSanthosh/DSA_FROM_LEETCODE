class Solution {
    public String largestOddNumber(String n) {
        for(int i=n.length()-1;i>=0;i--){
            char c=n.charAt(i);
            if((c-'0')%2==1) return n.substring(0,i+1);
        }
        return "";
    }
}