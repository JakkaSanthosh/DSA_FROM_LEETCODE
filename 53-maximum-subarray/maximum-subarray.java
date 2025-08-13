class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE,sum=0;
       for(var i:nums){
        if(sum<0) sum=0;
        sum+=i;
        max=Math.max(max,sum);
       }
       return max;
    }
}