class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean consecutiveOnes = false,consecutiveZeroes = false;
        while(n!=0){
            int bit=(n&1);
            if(bit==0){
                if(!consecutiveZeroes)
                    consecutiveZeroes=true;
                else return false;
                consecutiveOnes = false;
            }
            else{
                if(!consecutiveOnes) consecutiveOnes=true;
                else return false;
                consecutiveZeroes = false;
            }
            n>>=1;
        }
        return true;
    }
}