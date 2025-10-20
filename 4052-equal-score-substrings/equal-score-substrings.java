class Solution {
    public boolean scoreBalance(String s) {
        int sum[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int ch=(int)s.charAt(i)-96;
            if(i>0) sum[i]+=sum[i-1]+ch;
            else sum[i]=ch;
        }
        double half=sum[s.length()-1]/2.0;
        for(var i:sum){
           // System.out.print(i+" ");
            if(i==half) return true;
        }
        return false;
            
            }
}