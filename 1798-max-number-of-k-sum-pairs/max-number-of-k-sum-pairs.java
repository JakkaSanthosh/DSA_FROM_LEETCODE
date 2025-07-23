class Solution {
    public int maxOperations(int[] nums, int k) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(var i:nums) mp.put(i,1+mp.getOrDefault(i,0));
      int cnt=0;
      for(int i=0;i<nums.length;i++){
        int rem=k-nums[i];
        if(mp.containsKey(rem)&&mp.containsKey(nums[i])&&nums[i]!=rem){
            cnt++;
            mp.put(rem,mp.get(rem)-1);
            mp.put(nums[i],mp.get(nums[i])-1);
            if(mp.get(rem)==0) mp.remove(rem);
            if(mp.get(nums[i])==0) mp.remove(nums[i]);
        }
        else if(nums[i]==rem&&mp.containsKey(rem)&&mp.get(rem)>=2){
            cnt++;
            mp.put(nums[i],mp.get(nums[i])-2);
            if(mp.get(rem)==0) mp.remove(rem);
        }
      } 
      return cnt;
    }
}