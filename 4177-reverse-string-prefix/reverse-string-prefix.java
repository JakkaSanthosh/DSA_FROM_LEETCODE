class Solution {
    public String reversePrefix(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(i<k) res=s.charAt(i)+res;
            else res+=s.charAt(i);
        }
        return res;
    }
}