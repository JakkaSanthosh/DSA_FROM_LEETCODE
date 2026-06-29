class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(var i: patterns){
            if(word.indexOf(i)!=-1) res++;
        }
        return res;
    }
}