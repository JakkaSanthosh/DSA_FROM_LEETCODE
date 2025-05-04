class Solution {
    public boolean isUgly(int n) {
     if(n<=0) return false;
     int f[]={2,3,5};
     for(var i:f){
        while(n%i==0) n/=i;
     }
     return n==1;
    }
}