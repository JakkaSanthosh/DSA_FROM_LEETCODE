class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> al=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        Set<Integer> hs=new HashSet<>();
          for(int j=0;j<nums[i].length;j++){
            hs.add(nums[i][j]);
          }
          for(var item:hs) mp.put(item,1+mp.getOrDefault(item,0));
          for(var item:mp.keySet()){
            if(mp.get(item)==nums.length) al.add(item);
          }}
          Collections.sort(al);
          return al;
    }
}