class Solution {
    public int countSymmetricIntegers(int low, int high) {
      int c=0,i=low;
    //   int x=((int)Math.log10(low))+1;
    //   if(x%2!=0) i=low+1;
    //   else i=low;
        while(i<=high){
            String k=Integer.toString(i);
            if(k.length()%2==0){
                int sum=0,sum1=0;
             for(int m=0;m<k.length()/2;m++){
                sum+=k.charAt(m);
             }
             for(int m=k.length()/2;m<k.length();m++) sum1+=k.charAt(m);
            if(sum==sum1) c++; }
            i++; 
        }
        return c;
    }
}