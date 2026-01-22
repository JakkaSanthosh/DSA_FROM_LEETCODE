class Solution {
    public int vowelConsonantScore(String s) {
        int vc=0,cc=0;
        for(var i:s.toCharArray()){
            if("aeiou".contains(i+"")) vc++;
            else if("1234567890 ".contains(i+"")) continue;
            else cc++;
        }
        if(cc>0) return (int)vc/cc;
        return 0;
    }
}