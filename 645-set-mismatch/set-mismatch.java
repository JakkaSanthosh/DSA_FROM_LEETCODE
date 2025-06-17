class Solution {
    public int[] findErrorNums(int[] nums) {
       Set<Integer> hs=new HashSet<>();
       int a[]=new int[2];
       Arrays.sort(nums); 
       for(var i:nums){
        if(!hs.add(i)) a[0]=i;
       }
       for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)) a[1]=i;
       }
       return a;
    }
}