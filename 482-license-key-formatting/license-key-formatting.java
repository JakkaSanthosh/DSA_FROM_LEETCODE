class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String x="";
        String z="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='-') continue;
            if(Character.isLowerCase(c)) x=((char)(c-32))+x;
            else x=c+x;
            if(x.length()==k){
                if(i!=0)
                z='-'+x+z;
                else z=x+z;
                x="";}

        }return (x+z).replaceFirst("^-+", "");
    }
}