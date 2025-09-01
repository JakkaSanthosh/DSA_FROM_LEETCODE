class MagicDictionary {
    Set<String> hs;

    public MagicDictionary() {
        hs = new HashSet<>();
    }

    public void buildDict(String[] dictionary) {
        for (var i : dictionary)
            hs.add(i);
    }

    public boolean search(String searchWord) {
        for (var i : hs) {
            if (i.length() == searchWord.length() && !i.equals(searchWord)) {
                int cnt = 0;
               for(int j=0;j<i.length();j++){
                if(i.charAt(j)!=searchWord.charAt(j)) cnt++;
               }
                if (cnt == 1){
                     return true;
                }     
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */