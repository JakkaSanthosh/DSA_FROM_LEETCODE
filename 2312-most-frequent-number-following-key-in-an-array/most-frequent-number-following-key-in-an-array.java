class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]==key) mp.put(nums[i+1],1+mp.getOrDefault(nums[i+1],0));
    int maxc=0,tar=-1;
    for(var i:mp.keySet()){
        if(mp.get(i)>maxc){
            maxc=mp.get(i);
            tar=i;
        }
    }
    return tar;}
}