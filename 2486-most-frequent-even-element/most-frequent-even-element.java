class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:nums){
            if(i%2==0){
                mp.put(i,1+mp.getOrDefault(i,0));
            }
        }
        int freq=0,min=99999;
        System.out.println(mp);
        for(var i:mp.keySet()){
            if(mp.get(i)>freq){
                freq=mp.get(i);
                min=i;
            }
            else if(mp.get(i)==freq) min=Math.min(min,i);
        }
        return min==99999?-1:min;
    }
}