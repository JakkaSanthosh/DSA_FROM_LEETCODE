class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        int a[]=new int[k];
        List<Integer> al=new ArrayList<>();
        for(var i:mp.keySet()){
            al.add(mp.get(i));
        }
        Collections.sort(al);
        Set<Integer> hs=new HashSet<>();
        int c=0,j=1;
        while(c!=k){
            for(var i:mp.keySet()){
               if(mp.get(i)==al.get(al.size()-j)&& !hs.contains(i)){
                a[c++]=i;
                hs.add(i);
               }
            }
                j++;
        }
        return a;
    }
}