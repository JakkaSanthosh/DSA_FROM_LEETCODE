class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(var i:arr){
            if(i%2==1) c++;
            else c=0;
            if(c==3) return true;
        }
        return false;
    }
}