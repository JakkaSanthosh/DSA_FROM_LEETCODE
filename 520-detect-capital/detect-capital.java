class Solution {
    public boolean detectCapitalUse(String s) {
        int cc=0,sc=0,f=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65&&c<=91){
                     f=i;
                    cc++;
            }
            else {
                if(cc>1||f!=0) return false;
               sc++; 
            }
        }
        if(cc==s.length()||sc==s.length()) return true;
        if(f==0&&sc==s.length()-1) return true;
        return false;
    }
}