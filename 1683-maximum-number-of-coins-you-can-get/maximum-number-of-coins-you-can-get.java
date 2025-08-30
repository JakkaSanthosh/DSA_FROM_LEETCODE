class Solution {
    public int maxCoins(int[] piles) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(var i:piles) pq.offer(i);
       int res=0,k=pq.size()/3;
       while(pq.size()>k){
        pq.poll();
        res+=pq.poll();
        //pq.poll();
       }
       return res;
    }
}