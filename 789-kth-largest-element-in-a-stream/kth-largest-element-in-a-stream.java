class KthLargest {
     int k,nums[];
     Queue<Integer> pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.nums=nums;
        this.k=k;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k) pq.poll();
        return pq.isEmpty()?-1:pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */