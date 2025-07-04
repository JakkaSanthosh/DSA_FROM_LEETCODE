class WordFilter {
    Map<String,Integer> mp;
    public WordFilter(String[] words) {
        mp=new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<=words[i].length();j++){
                String pref=words[i].substring(0,j);
                for(int k=0;k<=words[i].length();k++){
                    String suff=words[i].substring(k);
                    mp.put(pref+"*"+suff,i);
                }
            }
        }
    }
    
    public int f(String pref, String suff) {
        return mp.getOrDefault(pref+"*"+suff,-1);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */