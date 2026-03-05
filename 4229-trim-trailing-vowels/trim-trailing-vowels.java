class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0&&"aeiou".contains(s.charAt(i)+"")) i--;
        return i==-1?"":s.substring(0,i+1);
    }
}