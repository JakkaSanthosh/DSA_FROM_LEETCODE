class Solution {
    public int numberOfSpecialChars(String word) {
       int a[]=new int[26];
       Map<Character,Integer> mp=new HashMap<>();
    for(var i:word.toCharArray()) mp.put(i,1+mp.getOrDefault(i,0));
    int ans=0;
    for(var i:mp.keySet()){
       char lower = Character.toLowerCase(i);
            char upper = Character.toUpperCase(i);
            int idx = lower - 'a';
            if (mp.containsKey(lower) && mp.containsKey(upper) && a[idx] == 0) {
                ans++;
                a[idx] = 1;
            }
    }
    return ans;
    }
}