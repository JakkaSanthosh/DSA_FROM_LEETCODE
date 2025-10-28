class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(simulate(nums.clone(),i,1)){
                    count++;
                }
                if(simulate(nums.clone(),i,-1)){
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean simulate(int[] nums,int start,int dir){
        int n=nums.length;
        int cur=start;
        while(cur>=0 && cur<n){
            if(nums[cur]==0){
                cur+=dir;
            }
            else{
                nums[cur]--;
                dir=-dir;
                cur+=dir;
            }
        }
        for(int num : nums){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}