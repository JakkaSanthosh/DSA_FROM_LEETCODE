class Solution {
    public int specialTriplets(int[] nums) {
        int cnt=0;
        int mod=(int)1e9+7;
        Map<Integer,Integer> rm=new HashMap<>();
        Map<Integer,Integer> lm=new HashMap<>();
        for(var i:nums) rm.put(i,rm.getOrDefault(i,0)+1);
        for(var i:nums){
            rm.put(i,rm.get(i)-1);
            if(rm.get(i)==0) rm.remove(i);
            long left = lm.getOrDefault(i * 2, 0);
            long right = rm.getOrDefault(i * 2, 0);
            cnt = (int)((cnt + (left * right) % mod) % mod);
            lm.put(i,lm.getOrDefault(i,0)+1);
        }
        return cnt%mod;
    }
}