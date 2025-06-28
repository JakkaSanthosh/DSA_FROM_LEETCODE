class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(); 
       int res[]=new int[k]; 
       for(int i=0;i<nums.length;i++){
        if(i>=k){
        pq.offer(Math.max(pq.poll(),nums[i]));}
        else pq.offer(nums[i]);
       }
       List<Integer> al=new ArrayList<>();
      while(!pq.isEmpty()){
        al.add(pq.poll());
      }       
      int c=0;
       for(int i=0;i<nums.length;i++){
        if(al.contains(nums[i])) {
            res[c++]=nums[i];
            al.remove(Integer.valueOf(nums[i]));}
       }
       return res;
    }
}