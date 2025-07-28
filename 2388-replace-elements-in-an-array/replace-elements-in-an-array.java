class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        mp.put(nums[i],i);
      }
      for(int i=0;i<operations.length;i++){
        int oldval=operations[i][0];
        int newval=operations[i][1];
        int idx=mp.get(oldval);
        nums[idx]=newval;
        mp.remove(oldval);
        mp.put(newval,idx);
      }
       return nums;
    }
}