class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(var i:stones) pq.offer(i);
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y) pq.offer(y-x);
        }
        return !pq.isEmpty()?pq.peek():0;
    }
}