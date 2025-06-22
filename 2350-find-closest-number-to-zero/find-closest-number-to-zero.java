class Solution {
    public int findClosestNumber(int[] nums) {
      int dist=999999,res=-9999999;
      for(int i=0;i<nums.length;i++){
        if(Math.abs(nums[i])<dist){
            dist=Math.abs(nums[i]);
            res=nums[i];
        }else if(Math.abs(nums[i])==dist){
            if(nums[i]>res) res=nums[i];
        }
      } 
      return  res;
    }
}
