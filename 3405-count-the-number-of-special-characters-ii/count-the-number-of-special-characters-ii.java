class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        boolean isTrue[] = new boolean[26];
        int[] low=new int[26],high=new int[26];
        Arrays.fill(low,1000000);
        Arrays.fill(high,1000000);
        for(var i:word.toCharArray()){
            if (Character.isUpperCase(i)&&high[i-'A']==1000000){
                int idx=word.indexOf(i);
                high[i-'A']=idx;
            }
            else if(Character.isLowerCase(i)&&low[i-'a']==1000000){
                int idx=word.lastIndexOf(i);
                low[i-'a']=idx;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                char lowch = Character.toLowerCase(ch);
                if (!isTrue[ch - 'A']&&low[lowch-'a']!=1000000&&low[lowch-'a']<high[ch-'A']) {
                    cnt++;
                    isTrue[ch - 'A'] = true;
                }
            }
        }
        return cnt;
    }
}