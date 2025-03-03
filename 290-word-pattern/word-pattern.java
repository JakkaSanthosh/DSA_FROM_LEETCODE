class Solution {
    public boolean wordPattern(String p, String s) {
        Map<Character,String> mp=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        String a[]=s.split("\\s+");
        if(p.length()!=a.length) return false;
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            if(!mp.containsKey(c)&&!hs.contains(a[i])){
                mp.put(c,a[i]);hs.add(a[i]);
            }
            else if(!mp.containsKey(c)&&hs.contains(a[i]))return false;
            else{
                if(!mp.get(c).equals(a[i])) return false;
            }
        }
        return true;
    }
}