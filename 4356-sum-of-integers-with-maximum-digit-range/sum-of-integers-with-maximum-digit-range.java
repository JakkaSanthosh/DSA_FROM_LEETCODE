class Solution {
    public int maxDigitRange(int[] nums) {
       Map<Integer,List<Integer>> mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums[i];
        while(n!=0){
            int r=n%10;
            if(r<min) min=r;
            if(r>max) max=r;
            n/=10;
        }
        int dr=max-min;
        if(!mp.containsKey(dr)) mp.put(dr,new ArrayList<>());
        mp.get(dr).add(nums[i]);
       } 
       int maxKey=Collections.max(mp.keySet());
       int sum=0;
       for(var i:mp.get(maxKey)) sum+=i;
       return sum;
    }
}