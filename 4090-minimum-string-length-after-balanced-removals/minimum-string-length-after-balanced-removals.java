class Solution {
    public int minLengthAfterRemovals(String s) {
        int ac=0,bc=0;
        for(var i:s.toCharArray()){
            if(i=='a') ac++;
            else bc++;
        }
        return Math.abs(ac-bc);
    }
}