class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int oneidx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(oneidx==-1) oneidx=i;
                else if(i-oneidx-1<k) return false;
                else oneidx=i;
            } 
        }
        return true;
    }
}