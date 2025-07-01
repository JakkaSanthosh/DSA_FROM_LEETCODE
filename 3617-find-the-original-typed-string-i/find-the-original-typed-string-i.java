class Solution {
    public int possibleStringCount(String word) {
        Set<Character> hs=new HashSet<>();
        int c=1;
        if(word.length()==0) return 0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)) c++;
        }
        return c;
    }
}