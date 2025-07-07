class Solution {
    public int findMaxK(int[] nums) {
       Set<Integer> hs=new HashSet<>();
       for(var i:nums) hs.add(i);
       Arrays.sort(nums);
       for(int i=nums.length-1;i>=0;i--){
        if(hs.contains(-1*nums[i])) return nums[i];
       }
       return -1;
    }
}