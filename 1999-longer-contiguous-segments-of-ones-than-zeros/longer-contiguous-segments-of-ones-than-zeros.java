class Solution {
    public boolean checkZeroOnes(String s) {
        int longones=0,longzeros=0,zc=0,oc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') {
                if(zc>longzeros) longzeros=zc;
                zc=0;
                oc++;}
            else{
                if(oc>longones) longones=oc;
                oc=0;
                zc++;
            }
        }
         if(oc>longones) longones=oc;
         if(zc>longzeros) longzeros=zc;
        return longones>longzeros;
    }
}