class Solution {
    public int[] decrypt(int[] code, int k) {
        int a[]=new int[code.length];
        if(k==0) return a;
        int n=code.length;
        if(k>0){for(int i=0;i<code.length;i++){
            int c=0,j=i+1,sum=0;
            while(c!=k){
                sum+=code[j%n];
                j++;c++;
            }
            a[i]=sum;
        }}
       else{
        int x=Math.abs(k);
        for(int i=n-1;i>=0;i--){
            int c=0,j=i-1,sum=0;
            while(c!=x){
                sum+=code[(n+j)%n];
                j--;c++;
            }
            a[i]=sum;
        }
       }
       return a;
    }
}