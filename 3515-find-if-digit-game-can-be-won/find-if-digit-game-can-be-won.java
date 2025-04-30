class Solution {
    public boolean canAliceWin(int[] nums) {
       int es=0,os=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>=1&&nums[i]<=9) os+=nums[i];
        else es+=nums[i];
       } 
       return Math.abs(es-os)>=1;
    }
}