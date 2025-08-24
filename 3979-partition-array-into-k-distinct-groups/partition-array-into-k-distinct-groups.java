class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0) return false;
       Map<Integer,Integer> mp=new HashMap<>();
       for(var i:nums) {
        mp.put(i,1+mp.getOrDefault(i,0));
        if(mp.get(i)>nums.length/k) return false;}     
       return true;
    }
}