class Solution {
    public boolean checkGoodInteger(int n) {
        long sum=0,sqrsum=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            sqrsum+=(r*r);
            n/=10;
        }
        return sqrsum-sum>=50;
    }
}