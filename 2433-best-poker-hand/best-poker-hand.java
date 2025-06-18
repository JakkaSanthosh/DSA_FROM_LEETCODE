class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character>  hs=new HashSet<>();
        for(var i:suits) hs.add(i);
        if(hs.size()==1) return "Flush";
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:ranks) mp.put(i,1+mp.getOrDefault(i,0));
        if(mp.size()==ranks.length) return "High Card";
        int cnt=-1;
        for(var i:mp.values()){
            if(i>cnt) cnt=i;
        }
        if(cnt==2) return "Pair";
        return "Three of a Kind";
    }
}