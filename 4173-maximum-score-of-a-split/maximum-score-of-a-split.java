class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long pre[]=new long[n];
        int suff[]=new int[n];
        pre[0]=nums[0];
        suff[n-1]=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(suff[i+1],nums[i+1]);
        }
        long res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            res=Math.max(res,pre[i]-suff[i]);
        }
        return res;
    }
}