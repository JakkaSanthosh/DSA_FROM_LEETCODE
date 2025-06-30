class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        int max=0;
        for(var i:mp.keySet()){
            if(mp.containsKey(i+1)) max=Math.max(max,mp.get(i)+mp.get(i+1));
        }
        return max;
    }
}