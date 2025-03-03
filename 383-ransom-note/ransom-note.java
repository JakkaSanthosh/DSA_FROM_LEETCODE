class Solution {
    public boolean canConstruct(String r, String m) {
       if(m.length()<r.length()) return false;
       Map<Character,Integer> mp1=new HashMap<>();
       Map<Character,Integer> mp2=new HashMap<>();
       for(var i:r.toCharArray()) mp1.put(i,mp1.getOrDefault(i,0)+1);
       for(var i:m.toCharArray()) mp2.put(i,mp2.getOrDefault(i,0)+1);
       for(var i: mp1.keySet()){
        if(!mp2.containsKey(i)) return false;
        else if(mp2.get(i)<mp1.get(i)) return false;
       }
       return true;
    }
}