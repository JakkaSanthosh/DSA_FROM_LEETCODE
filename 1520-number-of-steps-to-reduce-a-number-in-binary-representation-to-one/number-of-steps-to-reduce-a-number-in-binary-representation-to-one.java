import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger n = new BigInteger(s, 2);
        int c = 0;
        
        while (!n.equals(BigInteger.ONE)) {
            c++;
            if (n.testBit(0)) { // if n is odd (last bit = 1)
                n = n.add(BigInteger.ONE);
            } else {
                n = n.shiftRight(1); // divide by 2
            }
        }
        
        return c;
    }
}
