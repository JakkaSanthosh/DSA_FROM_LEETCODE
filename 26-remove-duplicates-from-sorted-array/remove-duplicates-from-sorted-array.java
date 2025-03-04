class Solution {
    public int removeDuplicates(int[] nums) {
      Set<Integer> x= new HashSet<>();
      int j=0;
      for(int i: nums){
      if (x.add(i)){
        nums[j++]=i;
      }
      }
      return j;
    }
}