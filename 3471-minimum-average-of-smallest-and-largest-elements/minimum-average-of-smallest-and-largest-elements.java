class Solution {
    public double minimumAverage(int[] nums) {
      double avg=Integer.MAX_VALUE;
      Arrays.sort(nums);
      int low=0,high=nums.length-1;
      while(low<high){
        avg=Math.min(avg,(nums[low]+nums[high])/2.0);
        low++;
        high--;
      } 
      return avg;
    }
}