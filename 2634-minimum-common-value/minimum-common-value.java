class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       Set<Integer> hs=new HashSet<>();
       for(var i:nums1) hs.add(i); 
       for(var i:nums2) if(hs.contains(i)) return i;
       return -1; 
    }
}