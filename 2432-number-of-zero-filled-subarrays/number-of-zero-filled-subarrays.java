class Solution {
    public long zeroFilledSubarray(int[] nums) {
      long res=0;
      int cnt=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            cnt++;
        }
        else{
             res+=(1L*cnt*(cnt+1))/2;
             cnt=0;
        }
      }
     res+=(1L*cnt*(cnt+1))/2;
     return res;
    }
}