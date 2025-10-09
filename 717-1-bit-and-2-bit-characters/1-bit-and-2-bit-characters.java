class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==1) return true;
        String x="";
        for(var i:bits) {
            x+=i;
            if(x.contains("11")||x.contains("10")) x="";
      }
        return !x.isEmpty();
    }
}