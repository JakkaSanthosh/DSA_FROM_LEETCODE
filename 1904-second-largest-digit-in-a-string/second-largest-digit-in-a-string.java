class Solution {
    public int secondHighest(String s) {
        int smax=-1,fmax=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int val=s.charAt(i)-'0';
                if(fmax==-1) fmax=val;
                else if(val>fmax){
                    smax=fmax;
                    fmax=val;
                }
                else if(val<fmax&&val>smax) smax=val;
            }
        }
        return smax;
    }
}