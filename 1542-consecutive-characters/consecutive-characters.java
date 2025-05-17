class Solution {
    public int maxPower(String s) {
        if(s.length()<=1) return s.length();
        int c=1,max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) c++;
            else{
                if(c>max){
                    max=c;
                }
                c=1;
            }
        }
   // if(max==0) return c;
        return Math.max(max,c);
    }
}