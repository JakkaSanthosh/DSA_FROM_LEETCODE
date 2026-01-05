class Solution {
    public String largestEven(String s) {
       int idx=s.lastIndexOf('2');
       return s.substring(0,idx+1); 
    }
}