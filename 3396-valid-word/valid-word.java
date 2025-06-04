class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        int vc=0,cc=0;
        for(var i:word.toCharArray()){
            if(i>=48&&i<=57||i>=65&&i<=91||i>=97&&i<=122){
                if("aeiouAEIOU".contains(i+"")) vc++;
                else if(!Character.isDigit(i)) cc++;
            }
            else return false;
        }
        return vc>=1&&cc>=1;
    }
}