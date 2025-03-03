class Solution {
    public boolean checkAlmostEquivalent(String w1, String w2) {
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();
        for(var i:w1.toCharArray()) mp1.put(i,mp1.getOrDefault(i,0)+1);
        for(var i:w2.toCharArray()) mp2.put(i,mp2.getOrDefault(i,0)+1);
        for(var i: mp1.keySet()){
         if(Math.abs(mp1.get(i)-mp2.getOrDefault(i,0))>3) return false;
        }
        for(var i: mp2.keySet()){
         if(Math.abs(mp2.get(i)-mp1.getOrDefault(i,0))>3) return false;
        }
        return  true;
    }
}