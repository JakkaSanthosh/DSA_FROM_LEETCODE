class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character,Long> mp=new HashMap<>();
        for(int i=0;i<cost.length;i++){
            mp.put(s.charAt(i),cost[i]+mp.getOrDefault(s.charAt(i),0L));
        }
        if(mp.size()==1) return 0;
        long sum=0,max=0;
        List<Integer> al=new ArrayList<>();
        for(var i:mp.values()){
            sum+=i;
            max=Math.max(max,i);
        }
        return sum-max;
    }
}