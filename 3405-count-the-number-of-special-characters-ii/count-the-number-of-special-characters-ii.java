class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> hs=new HashSet<>();
        for(var i:word.toCharArray()) hs.add(i);
        int cnt=0;
        for(var i:hs){
            if(Character.isUpperCase(i)&&hs.contains(Character.toLowerCase(i))&&word.lastIndexOf(Character.toLowerCase(i))<word.indexOf(i)) cnt++;
        }
        return cnt;
    }
}