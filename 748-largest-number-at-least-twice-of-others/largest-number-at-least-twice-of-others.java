class Solution {
    public int dominantIndex(int[] nums) {
     int idx=-1,max=0,smax=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            smax=max;
            max=nums[i];
            idx=i;
        }
        else if(nums[i]>smax&&nums[i]<=max) smax=nums[i];
     }
     return (max>=(2*smax))?idx:-1;
    }
}