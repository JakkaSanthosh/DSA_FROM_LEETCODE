class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(var i:words) mp.put(i,1+mp.getOrDefault(i,0));
        List<String> al=new ArrayList<>();
        List<String> list=new ArrayList<>(mp.keySet());
        list.sort((a,b)->{
            int fa=mp.get(a);
            int fb=mp.get(b);
            if(fa!=fb) return fb-fa;
            return a.compareTo(b);
        });
        for(var i:list){
            al.add(i);
           k--;
           if(k==0) return al;
        }
        return al;
            }
}