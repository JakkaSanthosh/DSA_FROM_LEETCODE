class Solution {
    public int[] frequencySort(int[] nums) {
       Map<Integer,Integer> mp=new HashMap<>();
       Integer arr[]=new Integer[nums.length];
        for(var i=0;i<nums.length;i++){
            mp.put(nums[i],1+mp.getOrDefault(nums[i],0));
            arr[i]=nums[i];}
        Arrays.sort(arr,(a,b)->{
            int fa=mp.get(a); 
            int fb=mp.get(b);
            if(fa!=fb) return fa-fb;
            return b-a; 
        });
        for(int i=0;i<nums.length;i++) nums[i]=arr[i];
        return nums;
    }
}