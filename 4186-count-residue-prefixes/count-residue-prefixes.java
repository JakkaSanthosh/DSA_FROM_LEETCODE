class Solution {
    public int residuePrefixes(String s) {
        Set<Character> hs=new HashSet<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
            if((i+1)%3==hs.size()) cnt++;
        }
        return cnt;
    }
}