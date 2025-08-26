class RandomizedSet {
    Set<Integer> hs;
    Random rand;
    public RandomizedSet() {
        hs=new HashSet<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        if(!hs.contains(val)) return false;
        hs.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx = rand.nextInt(hs.size());
        return new ArrayList<>(hs).get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */