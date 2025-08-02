class Solution {
    public int findKOr(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:nums){
            int x=0;
            while(i!=0){
                int bit=(i&1);
                if(bit==1) mp.put(x,mp.getOrDefault(x,0)+1);
                x++;
                i>>=1;
            }
        }
        int n=0;
        for(var i:mp.keySet()){
            if(mp.get(i)>=k){
                n|=(1<<i);
            }
        }
        return n;
    }
}