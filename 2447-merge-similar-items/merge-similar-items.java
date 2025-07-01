class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        List<List<Integer>> outer=new ArrayList<>();
        for(int i=0;i<items1.length;i++){
            mp.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            mp.put(items2[i][0],items2[i][1]+mp.getOrDefault(items2[i][0],0));
        }
        for(var i:mp.keySet()){
            outer.add(Arrays.asList(i,mp.get(i)));
        }
        return outer;
            }
}