class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(var i:s.toCharArray()) mp.put(i,1+mp.getOrDefault(i,0));
        String res="";
        for(var i:order.toCharArray()){
            if(mp.containsKey(i)) res+=(i+"").repeat(mp.get(i));
            mp.remove(i);
        }
        for(var i:mp.keySet()){
            res+=(i+"").repeat(mp.get(i));
        }return res;
            }
}