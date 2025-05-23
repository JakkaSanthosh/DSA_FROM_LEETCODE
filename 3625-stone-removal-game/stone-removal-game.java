class Solution {
    public boolean canAliceWin(int n) {
        int k=10,cnt=0;
        while(n>=k&&k>0){
            cnt++;
           n-=k;
           k--;
        }
        return cnt%2==1;
    }
}