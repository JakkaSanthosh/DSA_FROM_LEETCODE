class Solution {
    public long[] findPrefixScore(int[] nums) {
     long a[]=new long[nums.length];
     a[0]=nums[0]+nums[0];
    // long sum=a[0];
     for(int i=1;i<nums.length;i++){
        int k=Math.max(nums[i-1],nums[i]);
        int x=nums[i];
        nums[i]=k;
        k+=x;
        a[i]=k+a[i-1];
     }
     return a;
    }
}