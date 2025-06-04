class Solution {
    public String greatestLetter(String s) {
        String x="";
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((Character.isLowerCase(ch) && mp.containsKey(Character.toUpperCase(ch)))||(Character.isUpperCase(ch) && mp.containsKey(Character.toLowerCase(ch)))){
                   char upper=Character.toUpperCase(ch);
                   if((upper+"").compareTo(x)>0) x=upper+"";
            }
             mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
       return x;
    }
}