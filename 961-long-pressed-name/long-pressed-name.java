class Solution {
    public boolean isLongPressedName(String name, String typed) {
       int p1=0,p2=0;
       while(p2<typed.length()){
        if(p1<name.length()&&name.charAt(p1)==typed.charAt(p2)){
            p1++;
            p2++;
        }
        else if(p2>0&&typed.charAt(p2-1)==typed.charAt(p2)) p2++;
        else return false;
       } 
       return p1==name.length();
    }
}