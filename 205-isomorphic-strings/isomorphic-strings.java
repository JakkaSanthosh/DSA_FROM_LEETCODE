class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> mp1=new HashMap<>();  
         Map<Character,Integer> mp2=new HashMap<>();
          for(int i=0;i<s.length();i++){
             char ch1=s.charAt(i);
             char ch2=t.charAt(i);
             if(!mp1.containsKey(ch1)) mp1.put(ch1,i);
             if(!mp2.containsKey(ch2)) mp2.put(ch2,i);
             if(mp1.get(ch1)!=mp2.get(ch2))
            return false;
        }
        return true;
    }
}