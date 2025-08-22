public class Solution {
    public bool IsPalindrome(int x) {
        if(x<0) return false;
        int n=x,prod=0;
        while(n!=0){
            int r=n%10;
            prod=prod*10+r;
            n/=10;
        }
        return prod==x;
    }
}