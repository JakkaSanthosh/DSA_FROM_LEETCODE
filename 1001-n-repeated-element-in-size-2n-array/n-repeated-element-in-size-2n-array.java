class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length/2;
        for(var i:nums) {
          mp.put(i,1+mp.getOrDefault(i,0));
          if(mp.get(i)==n) return i;
        }
        return -1;
    }
}