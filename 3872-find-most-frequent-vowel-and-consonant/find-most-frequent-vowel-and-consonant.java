class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> v=new HashMap<>();
        Map<Character,Integer> c=new HashMap<>();
        for(var i:s.toCharArray()){
            if("AEIOUaeiou".contains(i+"")) v.put(i,v.getOrDefault(i,0)+1);
            else c.put(i,c.getOrDefault(i,0)+1);
        }
        int k1=0,k2=0;
      for(var i: v.values()){
        if(i>k1) k1=i;
      }
      for(var i: c.values()){
        if(i>k2) k2=i;
      }
      return k1+k2;
    }
}