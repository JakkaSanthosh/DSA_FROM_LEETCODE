class Solution {
    public String makeFancyString(String s) {
        StringBuilder k=new StringBuilder(s);
        for(int i=1;i<=k.length()-2;i++){
            if((k.charAt(i)==k.charAt(i-1))&&(k.charAt(i)==k.charAt(i+1))){
                k.deleteCharAt(i);
                i-=1;
            }
        }
        return k.toString();
    }
}