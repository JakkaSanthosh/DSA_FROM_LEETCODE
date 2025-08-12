class MapSum {
    Map<String,Integer> mp;
    public MapSum() {
        mp=new HashMap<>();
    }
    
    public void insert(String key, int val) {
        mp.put(key,val);
    }
    
    public int sum(String prefix) {
        int ans=0;
        for(var i:mp.keySet()){
            if(i.startsWith(prefix)) ans+=mp.get(i);
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */