class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;
        int k=-1;
        for(int i=0;i<s.length();i++){
            if(t.length()<s.length()-i) return false;
            char c=s.charAt(i);
            if(!t.contains(c+"")) return false;
            else {
               int z= t.indexOf(c);
 t=t.substring(z+1);

            }
        }
        return true;
    }
}