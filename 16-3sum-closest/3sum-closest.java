class Solution {
    public int threeSumClosest(int[] nums, int target) {
       TreeMap<Integer,Integer> mp=new TreeMap<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
        int l=i+1,h=nums.length-1;
        while(l<h){
            int s=nums[i]+nums[l]+nums[h];
            if(s==target) return s;
            else if(s<target){
                l++;
            }
            else {
                h--;
               }
            int key=s<target?target-s:s-target;
             if (!mp.containsKey(key) || mp.get(key) > s) {
                    mp.put(key, s);
                }
           
        }
       } 
    for(var i:mp.keySet()){
       return mp.get(i);
    }
    return -1;
    }
}