class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n;
        if(s.length()%k==0) n=s.length()/k;
        else n=s.length()/k+1;
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            if(s.length()>=k){
                a[i]=s.substring(0,k);
                s=s.substring(k);
            }
            else{
                a[i]=s+((fill+"").repeat(k-s.length()));
            }
        }
        return a;
    }
}