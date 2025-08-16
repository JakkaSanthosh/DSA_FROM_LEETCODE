class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        String k="";
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='6'){
                k+='9';
                j=i;
                break;
            }
            k+=c;
        }
        if(k.length()==s.length()){
            return Integer.parseInt(k);
        }
        for(int x=j+1;x<s.length();x++){
             char c=s.charAt(x);
               k+=c;
        }
        return Integer.parseInt(k);
    }
}