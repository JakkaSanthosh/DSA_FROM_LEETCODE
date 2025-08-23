class Solution {
    public int beautySum(String s) {
        int res=0;
        Map<Character,Integer> mp;
        for(int i=0;i<s.length()-1;i++){
            mp=new HashMap<>();
            char ch=s.charAt(i);
            mp.put(ch,1);
            for(int j=i+1;j<s.length();j++){
                char ch2=s.charAt(j);
                mp.put(ch2,mp.getOrDefault(ch2,0)+1);
                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
                for(var k:mp.values()){
                    min=Math.min(k,min);
                    max=Math.max(k,max);
                }
                res+=max-min;
            }
        }
        return res;
    }
}