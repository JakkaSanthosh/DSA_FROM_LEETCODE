class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        Map<Character,Integer> mp1=new TreeMap<>();
        Map<Character,Integer> mp2=new TreeMap<>();
        if(s.equals(goal)){
            Set<Character> hs=new HashSet<>();
            for(var i: s.toCharArray()) hs.add(i);
            return hs.size()<goal.length();
        }
        for(var i: s.toCharArray()) mp1.put(i,mp1.getOrDefault(i,0)+1);
        for(var i: goal.toCharArray()) mp2.put(i,mp2.getOrDefault(i,0)+1);
      if(!mp1.equals(mp2)) return false;
     int c=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=goal.charAt(i)) c++;
     }
     return c==2;
    }
}