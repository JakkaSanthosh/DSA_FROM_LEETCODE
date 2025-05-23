import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> al=new ArrayList<>();
        String x=new String();
        for(var i:num) x+=i;
        BigInteger big=new BigInteger(x);
        big=big.add(BigInteger.valueOf(k));
        while(!big.equals(BigInteger.ZERO)){
            int r=big.mod(BigInteger.TEN).intValue();
            al.add(r);
            big=big.divide(BigInteger.TEN);
        }
        Collections.reverse(al);
        return al;
    }
}