class Solution {
    public int minimumOperations(int[] nums) {
       Queue<Integer> pq=new PriorityQueue<>();
       int c=0,zc=0,x=0;
       for(var i:nums){
        if(i!=0) pq.add(i);
        else zc++;
       }
       while(zc!=nums.length){
        if(!pq.isEmpty())
           x=pq.poll();
           pq.clear();
           for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
              nums[i]-=x; 
              if(nums[i]==0) zc++;
              else pq.offer(nums[i]);
           }}
           c++;
       }
       return c;
    }
}