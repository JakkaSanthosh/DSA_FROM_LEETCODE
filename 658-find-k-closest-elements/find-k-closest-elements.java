class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Map<Integer,Integer> mp=new HashMap<>();
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(var i:arr){
            mp.put(i,Math.abs(i-x));
            freq.put(i,freq.getOrDefault(i,0)+1);}
        List<Integer> list=new ArrayList<>(mp.keySet());
        list.sort((a,b)->{
            int da=mp.get(a);
            int db=mp.get(b);
            if(da!=db) return da-db;
            return a-b;
        });
        for(var i:list){
           int x1=freq.get(i);
           while(x1-->0){
            al.add(i);
            k--;
            if(k==0) break;
           }
           if(k==0) break;
        }
        Collections.sort(al);
        return al;
    }
}