class Solution {
    public int rearrangeCharacters(String s, String target) {
        int min=99999999;
        Map<Character,Integer> mp=new HashMap<>();
        for(var i:s.toCharArray()){
           mp.put(i,1+mp.getOrDefault(i,0));
        }
        Map<Character,Integer> mp1=new HashMap<>();
        for(var i:target.toCharArray()){
           mp1.put(i,1+mp1.getOrDefault(i,0));
        }
       for(char i:target.toCharArray()){
        if(!mp.containsKey(i)) return 0;
        else min=Math.min(min,mp.get(i)/mp1.get(i));
       }
       return min;
    }
}