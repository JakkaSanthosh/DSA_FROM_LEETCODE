class Solution {
    public int removeDuplicates(int[] nums) {
       Map<Integer,Integer> mp=new LinkedHashMap<>();
       for(var i:nums) mp.put(i,1+mp.getOrDefault(i,0));
       int k=0;
       for(var i:mp.keySet()){
        if(mp.get(i)==1) nums[k++]=i;
        else{
            nums[k++]=i;
            nums[k++]=i;
        }
       }
       return k;
    }
}