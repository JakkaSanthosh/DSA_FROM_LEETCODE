class Solution {
    public int[] productExceptSelf(int[] nums) {
       int pa[]=new int[nums.length];
       int sa[]=new int[nums.length];
       pa[0]=nums[0];
       sa[nums.length-1]=nums[nums.length-1];
       for(int i=1;i<nums.length;i++){
        pa[i]=pa[i-1]*nums[i];
       }
       for(int i=nums.length-2;i>=0;i--){
        sa[i]=sa[i+1]*nums[i];
       } nums[0]=sa[1];
       nums[nums.length-1]=pa[nums.length-2];
       for(int i=1;i<nums.length-1;i++){
        nums[i]=pa[i-1]*sa[i+1];
       }
       return nums;
    }
}