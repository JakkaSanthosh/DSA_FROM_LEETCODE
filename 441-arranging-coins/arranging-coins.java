class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        int i=1;
         while(n>0){
            n-=i;
            c++;
            if(n==0) return c;
            i++;
         }return c-1;
    }
}