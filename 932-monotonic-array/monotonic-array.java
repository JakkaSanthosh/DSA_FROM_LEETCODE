class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1)
            return true;
        if (nums[1] > nums[0]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1])
                    return false;
            }
        } else if (nums[1] < nums[0]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1])
                    return false;
            }
        }
        else{
            int g=0,l=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    if(l==1) return false;
                    g=1;
                }
                else if(nums[i]<nums[i-1]){
                    if(g==1) return false;
                    l=1;
                }
            }
        }
        return true;
    }
}