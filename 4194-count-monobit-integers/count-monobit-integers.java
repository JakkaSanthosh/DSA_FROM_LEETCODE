class Solution {
    public int countMonobit(int n) {
        int cnt=0;
        for(int i=0;i<=n;i++){
            int bitCnt=Integer.bitCount(i);
            if(bitCnt==Integer.toString(i,2).length()||bitCnt==0) cnt++;
        }
        return cnt;
    }
}