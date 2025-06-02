class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        List<List<String>> al=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String x=checkAnagram(strs[i]);
            if(!mp.containsKey(x)) mp.put(x,new ArrayList<>());
            mp.get(x).add(strs[i]);
        }
        for(var i:mp.values()) al.add(i);
        return al;
    }
   static String checkAnagram(String s){
    char a[]=s.toCharArray();
    Arrays.sort(a);
    String z="";
    for(var i:a) z+=i;
    return z;
   }
}