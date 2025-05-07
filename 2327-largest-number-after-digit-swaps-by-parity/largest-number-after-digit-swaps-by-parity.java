class Solution {
    public int largestInteger(int num) {
        int x=num;
        Queue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        while(x!=0){
           int r=x%10;
          (r%2==0 ? even:odd).add(r);
           x/=10;
        }
        StringBuilder sb=new StringBuilder();
       for(var i: Integer.toString(num).toCharArray()){
        int k=i-'0';
        sb.append((k%2==0 ? even: odd).poll());
       }
        return Integer.parseInt(sb.toString());
    }
}