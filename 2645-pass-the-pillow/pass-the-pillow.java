class Solution {
    public int passThePillow(int n, int time) { 
        n-=1;
        int rounds=time/n;
        int rem=time%n;
        if(rounds%2==0) return rem+1;
        return n-rem+1;
    }
}