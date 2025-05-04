class Solution {
    public int numEquivDominoPairs(int[][] d) {
      Map<String,Integer> mp=new HashMap<>();
      int c=0;
      for(int i=0;i<d.length;i++){
        int a=Math.min(d[i][0],d[i][1]);
        int b=Math.max(d[i][0],d[i][1]);
         String x=a+""+b;
         c+=mp.getOrDefault(x,0);
         mp.put(x,1+mp.getOrDefault(x,0));
      }
    
     return c;
    }
}