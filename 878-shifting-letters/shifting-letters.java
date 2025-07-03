class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        shifts[shifts.length-1]%=26;
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=(shifts[i]+shifts[i+1])%26;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append((char)((s.charAt(i)-97+shifts[i])%26+97));
        }
        return sb.toString();
    }
}