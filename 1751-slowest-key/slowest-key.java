class Solution {
    public char slowestKey(int[] rtime, String keys) {
        char ch='\0';
        int max=0;
        for(int i=0;i<keys.length();i++){
            if(i==0) {
                max=rtime[0];
                ch=keys.charAt(i);}
            else if(rtime[i]-rtime[i-1]>max){ 
                max=rtime[i]-rtime[i-1];
                ch=keys.charAt(i);}
            else if(rtime[i]-rtime[i-1]==max&&ch<keys.charAt(i)) ch=keys.charAt(i);
        }
        return ch;
    }
}