class Solution {
    public String frequencySort(String s) {
         Map<Character,Integer> mp=new HashMap<>();
         for(var i:s.toCharArray()) mp.put(i,1+mp.getOrDefault(i,0));
         List<Character> al=new ArrayList<>(mp.keySet());
         al.sort((a,b)->{
            return mp.get(b)-mp.get(a);
         });
         StringBuilder sb=new StringBuilder();
         for(var i:al){
            int freq=mp.get(i);
            while(freq-->0) sb.append(i);
         }
         return sb.toString();
    }
}