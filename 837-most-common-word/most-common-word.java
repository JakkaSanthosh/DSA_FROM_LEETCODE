class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> mp=new HashMap<>();
        List<String> al=new ArrayList<>();
        for(var i: banned) al.add(i.toLowerCase());
        String cleaned = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String s[]=cleaned.split("\\s+");
        for(var i:s){
            insert(i,mp,al);
        }
      String z="";
      int k=0;
      for(var i:mp.entrySet()){
        if(i.getValue()>k){
            k=i.getValue();
            z=i.getKey();

        }
      }
      return z;
    }
    static void insert(String s,Map<String,Integer> mp,List<String> al){
        String k=s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if(!al.contains(k)) mp.put(k,mp.getOrDefault(k,0)+1);
    }
}