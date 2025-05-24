class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(var i:s.toCharArray()){
            mp.put(i,1+mp.getOrDefault(i,0));
        }
        int ec=0,oc=0;
        for(var i:mp.keySet()){
            if(mp.get(i)%2==0) ec+=mp.get(i);
            else{
                ec+=mp.get(i)-1;
                oc++;
            }
        }
        return ec+(oc!=0?1:0);
    }
}