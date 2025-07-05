class Solution {
    public int dominantIndex(int[] nums) {
      int a[]=nums.clone();
      Arrays.sort(a);
      if(a[a.length-1]<(2*a[a.length-2])) return -1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==a[a.length-1]) return i;
     }
     return -1;
    }
}